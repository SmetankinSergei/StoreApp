package org.example;

import org.example.panels.store.Item;
import org.example.service.ViewRepair;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    List<Item> itemsList = new ArrayList<>();

    public Cart() {

    }

    public void addItemInCart(Item item) {
        itemsList.add(item);
    }

    public void dropItemFromCart(Item item) {
        itemsList.removeIf(cartItem -> cartItem.getId() == item.getId());
        ViewRepair.repair();
    }

    public List<Item> getItemsList() {
        return itemsList;
    }
}
