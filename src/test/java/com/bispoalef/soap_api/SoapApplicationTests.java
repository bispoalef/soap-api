package com.bispoalef.soap_api;

import com.bispoalef.soap_api.controller.ProdutoController;
import com.bispoalef.soap_api.entites.Departamento;
import com.bispoalef.soap_api.entites.Produtos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SoapApplicationTests {

	@InjectMocks
	ProdutoController produtoController;

	@Test
	@DisplayName("fazer requesição e retornar ok")
	void fazerRequisicaoAposRetornarDados() {

		List<Produtos> retorno = produtoController.buscarProdutos();

		Assertions.assertNotNull(retorno);
        Assertions.assertEquals(3, retorno.size());
	}

}
