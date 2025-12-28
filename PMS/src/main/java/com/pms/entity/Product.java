package com.pms.entity;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "product_id", length = 20, nullable = false, unique = true)
    private String pid;

    @Column(nullable = false)
    private double price;

    @Column(name = "company_name", length = 50, nullable = false)
    private String companyName;

    @Column(name = "manufacture_date", nullable = false)
    private LocalDate dateOfManufacture;

    @Column(name = "expiry_date")
    private LocalDate expDate;

    @Column(name = "product_type", length = 30)
    private String productType;

    @Column(length = 255)
    private String details;

    @Column(length = 50)
    private String colors;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    @ToString.Exclude
    private Owner owner;

    @Transient
    public int getAgeOfProduct() {
        return Period.between(dateOfManufacture, LocalDate.now()).getYears();
    }
}

