package com.bispoalef.soap_api.entites;


import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
public class Departamento implements Serializable {

    @Serial
    private static final long serialVersionUID = 6864343073747511496L;

    private Lind id;
    private String nome;
    
}
