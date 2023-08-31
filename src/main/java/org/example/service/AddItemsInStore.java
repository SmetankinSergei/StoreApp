package org.example.service;

import org.example.panels.store.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class AddItemsInStore {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Item.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        //Item item = new Item("Science Fiction", "Arthur Clarke", "Childhood's end", 490, 25);


        session.beginTransaction();
        //session.save(item);
        //Item item = session.get(Item.class, 20);

        // rows amount
        Object _count = session.createCriteria(Item.class)
                .setProjection(Projections.count("id")).uniqueResult();
        Long count = (Long) _count;

        //int x = session.createQuery("SELECT count(*) FROM my_db.books_store").;
        System.out.println(count + " - I found!!!");
        session.getTransaction().commit();
    }
}
