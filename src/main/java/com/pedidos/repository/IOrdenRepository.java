package com.pedidos.repository;

import com.pedidos.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenRepository extends JpaRepository<Orden,Long> {
}
