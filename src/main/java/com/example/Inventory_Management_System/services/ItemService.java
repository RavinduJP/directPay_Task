package com.example.Inventory_Management_System.services;

import com.example.Inventory_Management_System.entities.Item;

import java.util.List;

public interface ItemService {

    Item addItem(Item item);

     List<Item> findAllItems();

     String editItem(Item item);

    String deleteItem(long id);

}
