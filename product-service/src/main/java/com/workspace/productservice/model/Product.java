package com.workspace.productservice.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@Document(value = "product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
