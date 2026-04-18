package com.example.facturacion.service;

import com.example.facturacion.model.Factura;
import com.example.facturacion.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    // Obtener todas las facturas
    public List<Factura> listarTodas() {
        return facturaRepository.findAll();
    }

    // Obtener una factura por ID
    public Optional<Factura> obtenerPorId(Long id) {
        return facturaRepository.findById(id);
    }

    // Guardar una nueva factura
    public Factura guardar(Factura factura) {
        return facturaRepository.save(factura);
    }

    // Eliminar una factura
    public void eliminar(Long id) {
        facturaRepository.deleteById(id);
    }
}