package com.akki.businessmodel.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;
    private String name;
    @Embedded
    private Details details;
    private String accountType;
    private String[] businessRequirements;
    private String contractType;

}
