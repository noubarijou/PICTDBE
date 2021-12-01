package com.pictd.grupo1.ProjetoIntegrador.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private double preco;
    private String descricao;
    private String imagem;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
