package com.pedidos.service;

import com.pedidos.dao.OrdenDAOImpl;
import com.pedidos.dto.OrdenDTO;
import com.pedidos.model.Orden;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdenService {
    @Autowired
    private OrdenDAOImpl ordenDAO;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<OrdenDTO> obtenerOrdenes() {
        List<OrdenDTO> lista = new ArrayList<>();
        lista = ordenDAO.obtenerOrdenes()
                .stream()
                .map(orden -> modelMapper.map(orden, OrdenDTO.class))
                .collect(Collectors.toList());
        return lista;
    }

    public OrdenDTO crearOrden(OrdenDTO ordenDTO) {
        Orden orden = modelMapper.map(ordenDTO, Orden.class);
        orden = ordenDAO.crearOrden(orden);
        return modelMapper.map(orden, OrdenDTO.class);
    }

    public OrdenDTO obtenerOrdenById(long idOrden) {
        OrdenDTO ordenDTO = new OrdenDTO();
        ordenDTO = modelMapper.map(ordenDAO.obtenerOrdenByID(idOrden), OrdenDTO.class);
        return ordenDTO;
    }

    public void eliminarOrden(OrdenDTO ordenDTO) {
        Orden orden = modelMapper.map(ordenDTO, Orden.class);
        ordenDAO.eliminarOrden(orden);
    }
}
