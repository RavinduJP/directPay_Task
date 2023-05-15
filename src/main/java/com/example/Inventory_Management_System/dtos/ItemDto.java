package com.example.Inventory_Management_System.dtos;

import com.sun.istack.NotNull;

import java.time.LocalDate;

public class ItemDto {

    private long sKu;
    private String category;
    private String itemName;
    private String description;
    private int itemPrice;
    private int itemCount;
    private LocalDate addedDate;
    private String remarks;
}
