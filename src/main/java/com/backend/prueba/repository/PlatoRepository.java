package com.backend.prueba.repository;


import com.backend.prueba.model.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends MongoRepository<Plato, Long> {
}
