package com.pedidos.dao;

import com.pedidos.model.Orden;

import java.util.Arrays;
import java.util.List;

public interface IOrdenDAO {
    List<Orden> obtenerOrdenes();
    Orden crearOrden(Orden orden);
    Orden obtenerOrdenByID(long id);
    void eliminarOrden(Orden orden);
}
