package com.backend.prueba.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Cliente")
public class Cliente {

    private Long id_cliente;


    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;




}
