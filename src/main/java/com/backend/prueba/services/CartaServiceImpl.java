package com.backend.prueba.services;

import com.backend.prueba.model.Carta;
import com.backend.prueba.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CartaServiceImpl extends GenericServiceImpl<Carta, Long> implements CartaService{

    @Autowired
    private CartaRepository cartaRepository;
    @Override
    public CrudRepository<Carta, Long> getDao() {
        return cartaRepository;
    }
}
