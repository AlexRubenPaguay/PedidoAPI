package com.pedidos.controller;


import com.pedidos.dto.OrdenDTO;
import com.pedidos.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedido/")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping("listAllOrdenes")
    public List<OrdenDTO> obtenerOrdenes() {
        return ordenService.obtenerOrdenes();
    }

    @GetMapping("ordenById/{idOrden}")
    public OrdenDTO obtenerOrdenById(@PathVariable long idOrden) {
        return ordenService.obtenerOrdenById(idOrden);
    }

    @DeleteMapping("eliminarOrden")
    public ResponseEntity<String> eliminarOrden(@RequestBody OrdenDTO ordenDTO) {
        ordenService.eliminarOrden(ordenDTO);
        return ResponseEntity.ok("La orden No: " + ordenDTO.getId() + " se ha eliminado correctamente...");
    }

    @PostMapping("crearPedido")
    public OrdenDTO crearOrden(@RequestBody OrdenDTO ordenDTO) {
        return ordenService.crearOrden(ordenDTO);
    }
}
