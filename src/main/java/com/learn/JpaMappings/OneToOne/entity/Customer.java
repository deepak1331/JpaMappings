package com.learn.JpaMappings.OneToOne.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_name", nullable = false)
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    //This will create a columns with default name as <tablename_primanyIDColumnName)
    //here it will be item_id

    //if we want a custom name for the foreign key, we can use below @JoinColumn annotation
    @JoinColumn(name = "fk_item")
    private Item item;
}