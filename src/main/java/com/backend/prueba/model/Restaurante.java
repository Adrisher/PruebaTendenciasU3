package com.backend.prueba.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Restaurante")
public class Restaurante {

    private Long id_restaurant;


    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    //Relacion con client
    private List<Cliente> listaClientes;

    //Relacion con carta
    private List<Carta> listaCartas;
}
