package com.backend.prueba.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Carta")
public class Carta {

    private Long id_carta;


    private String nombre;
    private String categoria;
    private Integer cantidad;

    //Relaciones con plato
     List<Plato> listaPlatos;
}
