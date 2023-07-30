package com.example.Inventory_Management_System.services.impl;

import com.example.Inventory_Management_System.entities.Item;
import com.example.Inventory_Management_System.repositories.ItemRepository;
import com.example.Inventory_Management_System.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;


    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public String editItem(Item updateItem) {
        if (itemRepository.existsById(updateItem.getId())) {
            Item item = itemRepository.getBysKU(updateItem.getSKU());
            item.setSKU(updateItem.getSKU());
            item.setAddedDate(updateItem.getAddedDate());
            item.setCategory(updateItem.getCategory());
            item.setDescription(updateItem.getDescription());
            item.setItemCount(updateItem.getItemCount());
            item.setItemName(updateItem.getItemName());
            item.setItemPrice(updateItem.getItemPrice());
            item.setRemarks(updateItem.getRemarks());
//            item.setId(updateItem.getId());

            itemRepository.save(item);

            return String.valueOf(HttpStatus.OK);
        } else
            return String.valueOf(HttpStatus.NOT_FOUND);
    }

    @Override
    public String deleteItem(long id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return String.valueOf(HttpStatus.OK);
        }else {
            return String.valueOf(HttpStatus.NOT_FOUND);
        }
    }
}
