package com.pms.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @Column(name = "owner_id", nullable = false, unique = true)
    private String ownerId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(length = 10)
    private Long phno;

    @Column(nullable = false, unique = true)
    private String email;

    private Integer age;

    @ToString.Exclude
    private String password;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Product> products;

    @OneToOne(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude
    private Address address;
}
