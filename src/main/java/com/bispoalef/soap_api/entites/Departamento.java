package com.bispoalef.soap_api.entites;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Departamento implements Serializable {

    @Serial
    private static final long serialVersionUID = 6864343073747511496L;

    private Long id;
    private String nome;

}
