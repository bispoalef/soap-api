package com.bispoalef.soap_api.controller;

import com.bispoalef.soap_api.entites.Departamento;
import com.bispoalef.soap_api.entites.Produtos;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/buscar")
@ResponseStatus(HttpStatus.OK)
public class ProdutoController {

    @GetMapping()
    public List<Produtos> buscarProdutos(){

        Departamento tech = new Departamento(1L, "Tech");
        Departamento pet = new Departamento(2L, "Pet");

        Produtos p1 = new Produtos(1L, "Macbook Pro", 4000.0, tech);
        Produtos p2 = new Produtos(2L, "PC Gamer", 5000.0, tech);
        Produtos p3 = new Produtos(2L, "Pet House", 300.0, pet);

        return Arrays.asList(p1, p2, p3);
    }
}
