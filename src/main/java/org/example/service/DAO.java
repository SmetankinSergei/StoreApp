package org.example.service;

import org.example.panels.store.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DAO {

    // close before end of application!
    SessionFactory sessionFactory;

    public DAO() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sessionFactory = new Configuration().configure()
                        .addAnnotatedClass(Item.class)
                        .buildSessionFactory();
            }
        }).start();
    }

    public Long getItemsAmount() {
        long count;
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Object _count = session.createCriteria(Item.class).
                    setProjection(Projections.count("id")).uniqueResult();
            count = (Long) _count;
            session.getTransaction().commit();
        } finally {
            //sessionFactory.close();
        }
        return count;
    }

    public List<Item> fillItemsList(int pageNumber) {
        List<Item> itemsList = new ArrayList<>();
        SessionFactory sessionFactory = new Configuration().configure()
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            long itemsAmount = getItemsAmount();
            long attemptsCount = 0;
            int skipItems = (pageNumber - 1) * 6;
            int itemID = 0;

            while (itemsList.size() < 6 ) {
                Item item = null;
                while (item == null) {
                    item = session.get(Item.class, itemID++);
                    if (attemptsCount <= itemsAmount) attemptsCount++;
                    else return itemsList;
                }
                if (skipItems > 0) {
                    skipItems--;
                    continue;
                } else {
                    itemsList.add(item);
                }
                if (attemptsCount == itemsAmount) return itemsList;
            }
        session.getTransaction().commit();
        } finally {
            //sessionFactory.close();
        }
        return itemsList;
    }
}
