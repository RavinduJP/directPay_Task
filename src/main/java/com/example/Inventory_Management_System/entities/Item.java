package com.example.Inventory_Management_System.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private long sKU;
    @NotNull
    private String category;
    @NotNull
    private String itemName;
    @NotNull
    private String description;
    @NotNull
    private int itemPrice;
    @NotNull
    private int itemCount;
    @NotNull
    private LocalDate addedDate;

    private String remarks;



}
