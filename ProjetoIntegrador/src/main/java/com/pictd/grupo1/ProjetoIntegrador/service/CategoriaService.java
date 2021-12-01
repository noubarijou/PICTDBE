package com.pictd.grupo1.ProjetoIntegrador.service;

import com.pictd.grupo1.ProjetoIntegrador.model.Categoria;
import com.pictd.grupo1.ProjetoIntegrador.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

}
