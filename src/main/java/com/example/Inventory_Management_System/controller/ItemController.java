package com.example.Inventory_Management_System.controller;

import com.example.Inventory_Management_System.entities.Item;
import com.example.Inventory_Management_System.repositories.ItemRepository;
import com.example.Inventory_Management_System.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

//    add  Item
    @PostMapping(path = "/add")
    public Item saveItem(@RequestBody Item item) {
        Item savedItem = itemService.addItem(item);
        return savedItem;
    }

//    display All items
    @GetMapping(path = "/allItems")
    public List<Item> getAllItems() {
        List<Item> items = itemService.findAllItems();
        return items;
    }

//    update item
    @PostMapping("/update/{id}")
    public String updateItems(@PathVariable("id") long id, @RequestBody Item item) {
        String updated = itemService.editItem(item);
        return updated;
    }

//    delete Item
    @DeleteMapping(path = "/delete-item/{sKU}")
    public String deleteItem(@PathVariable(value = "sKU") Long sKU) {
        String deleted = itemService.deleteItem(sKU);

        return deleted;
    }

}
