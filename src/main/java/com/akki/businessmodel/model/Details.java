package com.akki.businessmodel.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Details {

    private String sex;
    private String dob;
    private String city;

}
