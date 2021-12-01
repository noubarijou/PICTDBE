package com.pictd.grupo1.ProjetoIntegrador.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private Set<Produto> produtos = new HashSet<>();
}