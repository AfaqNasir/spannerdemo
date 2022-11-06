package com.anbuzhobbiez.spannerdemo.model;

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "employee")
@Data
@AllArgsConstructor
public class Employee {
    @PrimaryKey
    private String id;
    private String name;
}
