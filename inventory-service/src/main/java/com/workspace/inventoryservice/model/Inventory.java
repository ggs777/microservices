package com.workspace.inventoryservice.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Table(name = "t_inventory")
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
