package com.backend.prueba.repository;

import com.backend.prueba.model.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepository extends MongoRepository<Carta, Long> {
}
