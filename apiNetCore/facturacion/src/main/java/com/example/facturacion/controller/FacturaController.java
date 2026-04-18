package com.example.facturacion.controller;

import com.example.facturacion.model.Factura;
import com.example.facturacion.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
@CrossOrigin(origins = "*") // Añadimos esto para evitar bloqueos con la interfaz
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> obtenerTodas() {
        return facturaService.listarTodas();
    }

    @PostMapping
    public Factura crear(@RequestBody Factura factura) {
        return facturaService.guardar(factura);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerPorId(@PathVariable Long id) {
        return facturaService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // --- ESTE ES EL MÉTODO QUE TE FALTABA PARA EDITAR ---
    @PutMapping("/{id}")
    public ResponseEntity<Factura> actualizar(@PathVariable Long id, @RequestBody Factura facturaDetalles) {
        return facturaService.obtenerPorId(id).map(facturaExistente -> {
            // Actualizamos los campos con los nuevos datos
            facturaExistente.setNombreCliente(facturaDetalles.getNombreCliente());
            facturaExistente.setDireccionCliente(facturaDetalles.getDireccionCliente());
            facturaExistente.setCorreoCliente(facturaDetalles.getCorreoCliente());
            facturaExistente.setCodigoPostal(facturaDetalles.getCodigoPostal());
            facturaExistente.setTotal(facturaDetalles.getTotal());
            facturaExistente.setPedidoId(facturaDetalles.getPedidoId());
            
            Factura actualizada = facturaService.guardar(facturaExistente);
            return ResponseEntity.ok(actualizada);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        facturaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}