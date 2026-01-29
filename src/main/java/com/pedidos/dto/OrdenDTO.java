package com.pedidos.dto;

import com.pedidos.model.Articulo;
import com.pedidos.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenDTO {
    private Long id;
    private Cliente cliente;
    private Articulo articulo;
    private Date fecha;
}
