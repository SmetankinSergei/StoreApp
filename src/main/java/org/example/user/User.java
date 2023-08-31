package org.example.user;

import org.example.panels.store.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {

    UserState state = UserState.NEW_USER;
    int id = 0;
    String name = "user";
    List<Item> orders;

    public void exit() {
        id = 0;
        name = "user";
        orders.clear();
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getOrders() {
        return orders;
    }

    public void setOrders(List<Item> orders) {
        this.orders = orders;
    }
}
