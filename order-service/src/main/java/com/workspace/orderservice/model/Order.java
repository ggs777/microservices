package com.workspace.orderservice.model;


import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Table(name = "t_orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItems> orderLineItemsList;

}
