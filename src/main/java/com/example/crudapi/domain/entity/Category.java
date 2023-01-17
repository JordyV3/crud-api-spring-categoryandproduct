package com.example.crudapi.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "categories")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Category {
    @Id @GeneratedValue(strategy = SEQUENCE, generator = "products_id_seq")
    @SequenceGenerator(name = "products_id_seq", sequenceName = "products_id_seq", initialValue = 1, allocationSize = 1)
    private Short id;
    @Column(nullable = false, length = 50)
    private String name;
}
