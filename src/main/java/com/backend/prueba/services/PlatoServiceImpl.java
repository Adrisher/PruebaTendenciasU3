package com.backend.prueba.services;


import com.backend.prueba.model.Plato;
import com.backend.prueba.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PlatoServiceImpl extends GenericServiceImpl<Plato, Long> implements PlatoService{

    @Autowired
    private PlatoRepository platoRepository;
    @Override
    public CrudRepository<Plato, Long> getDao() {
        return platoRepository;
    }
}
