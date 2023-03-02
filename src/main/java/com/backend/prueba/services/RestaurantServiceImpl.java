package com.backend.prueba.services;

import com.backend.prueba.model.Restaurante;
import com.backend.prueba.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl extends GenericServiceImpl<Restaurante, Long> implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restaurantRepository;
    }
}
