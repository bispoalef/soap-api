package com.bispoalef.soap_api.repository;

import com.bispoalef.soap_api.entites.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

}
