package com.farmaciascomunales.compras.repository;

import com.farmaciascomunales.compras.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}