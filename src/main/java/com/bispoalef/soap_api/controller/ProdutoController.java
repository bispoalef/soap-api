package com.bispoalef.soap_api.controller;

import com.bispoalef.soap_api.entites.Produtos;
import com.bispoalef.soap_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/buscar")
@ResponseStatus(HttpStatus.OK)
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping()
    public List<Produtos> buscarProdutos(){

        List<Produtos> lista = produtoRepository.findAll();

        return lista;
    }
}
