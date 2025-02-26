package com.pro.traini8_mvp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;
}
