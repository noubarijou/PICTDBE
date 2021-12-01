package com.pictd.grupo1.ProjetoIntegrador.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private double preco;
    private String descricao;
    private String imagem;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


}
