package com.farmaciascomunales.compras.controller;

import com.farmaciascomunales.compras.model.Compra;
import com.farmaciascomunales.compras.service.CompraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    private final CompraService service;

    public CompraController(CompraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Compra> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Compra obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Compra crear(@RequestBody Compra compra) {
        return service.crear(compra);
    }
}