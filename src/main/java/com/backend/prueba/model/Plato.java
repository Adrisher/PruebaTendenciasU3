package com.backend.prueba.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Plato")
public class Plato {

    private Long id_plato;


    private String nombrePlato;
    private String descripcion;
    private Double precio;

}
