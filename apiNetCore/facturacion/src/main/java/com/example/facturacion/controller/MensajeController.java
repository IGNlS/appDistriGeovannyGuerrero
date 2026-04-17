package com.example.facturacion.controller;

import com.example.facturacion.model.Factura;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/mensajes")
@CrossOrigin(origins = "*")
public class MensajeController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/enviar-pro")
    public Map<String, String> enviarFacturaCompleta(@RequestBody Factura factura) {
        // Enviamos el objeto factura completo como un mensaje
        // Spring lo convertirá a JSON automáticamente para RabbitMQ
        rabbitTemplate.convertAndSend("pedidoEvent", factura);
        
        return Map.of("mensaje", "🚀 Datos enviados a RabbitMQ para procesar factura de: " + factura.getNombreCliente());
    }
}