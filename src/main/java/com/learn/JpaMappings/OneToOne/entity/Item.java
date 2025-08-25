package com.learn.JpaMappings.OneToOne.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item_name", nullable = false)
    private String name;

/*
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    //@JoinColumn(name = "fk_customer")
    private Customer customer;
*/

}

