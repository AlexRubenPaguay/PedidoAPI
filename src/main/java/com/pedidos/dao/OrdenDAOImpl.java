package com.pedidos.dao;

import com.pedidos.model.Orden;
import com.pedidos.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdenDAOImpl implements IOrdenDAO {
    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public List<Orden> obtenerOrdenes() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden crearOrden(Orden orden) {
        return ordenRepository.save(orden);
    }

    @Override
    public Orden obtenerOrdenByID(long id) {
        return ordenRepository.getById(id);
    }

    @Override
    public void eliminarOrden(Orden orden) {
        ordenRepository.delete(orden);
    }
}
