package com.example.Req.Customer;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class customerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name",nullable = false)
    private String FirstName;
    @Column(name = "last_name",nullable = true)
    private String LastName;

    @Column(name = "city",nullable = false)
    private String City;

}
