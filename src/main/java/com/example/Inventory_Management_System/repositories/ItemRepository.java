package com.example.Inventory_Management_System.repositories;

import com.example.Inventory_Management_System.dtos.ItemDto;
import com.example.Inventory_Management_System.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item getBysKU(long sKU);
}
