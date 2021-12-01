package com.pictd.grupo1.ProjetoIntegrador.controller;

import com.pictd.grupo1.ProjetoIntegrador.model.Categoria;
import com.pictd.grupo1.ProjetoIntegrador.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarTodos(){
        return ResponseEntity.ok(categoriaService.buscarTodos());
    }
}
