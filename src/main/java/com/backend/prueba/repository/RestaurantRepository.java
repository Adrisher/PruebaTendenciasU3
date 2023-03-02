package com.backend.prueba.repository;


import com.backend.prueba.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurante, Long> {
}
