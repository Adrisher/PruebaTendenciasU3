package com.backend.prueba.controllers;

import com.backend.prueba.model.Restaurante;
import com.backend.prueba.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarRestaurante() {
        return new ResponseEntity<>(restaurantService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearRestaurante(
            @RequestBody Restaurante r) {
        return new ResponseEntity<>(restaurantService.save(r),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarRestaurante(@PathVariable Long id, @RequestBody Restaurante r) {
        Restaurante rest = restaurantService.findById(id);
        if (rest == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                rest.setNombre(r.getNombre());
                rest.setTelefono(r.getTelefono());
                rest.setCorreo(r.getCorreo());
                rest.setDireccion(r.getDireccion());
                return new ResponseEntity<>(restaurantService.save(r), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminarRestaurante(@PathVariable Long id) {
        restaurantService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
