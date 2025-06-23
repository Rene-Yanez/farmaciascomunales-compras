package com.farmaciascomunales.compras.service;

import com.farmaciascomunales.compras.model.Compra;
import com.farmaciascomunales.compras.repository.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    private final CompraRepository repository;

    public CompraService(CompraRepository repository) {
        this.repository = repository;
    }

    public List<Compra> listar() {
        return repository.findAll();
    }

    public Compra obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Compra crear(Compra compra) {
        return repository.save(compra);
    }
}