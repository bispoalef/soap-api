package com.bispoalef.soap_api.entites;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Produtos implements Serializable {

    @Serial
    private static final long serialVersionUID = 8517435759757836259L;

    private Long id;
    private String nome;
    private Double preco;
    private Departamento departamento;
}
