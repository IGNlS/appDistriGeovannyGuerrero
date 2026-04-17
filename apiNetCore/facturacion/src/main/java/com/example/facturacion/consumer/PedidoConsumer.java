package com.example.facturacion.consumer;

import com.example.facturacion.model.Factura;
import com.example.facturacion.service.FacturaService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PedidoConsumer {

    @Autowired
    private FacturaService facturaService;

    // Cambiamos (String pedidoIdStr) por (Factura factura)
    @RabbitListener(queues = "pedidoEvent")
    public void recibirPedido(Factura factura) {
        
        // Verificamos que no llegue nulo
        if (factura == null) {
            System.err.println("⚠️ Se recibió un objeto nulo desde RabbitMQ.");
            return;
        }

        System.out.println("📦 Recibido pedido para: " + factura.getNombreCliente());

        try {
            // Generamos el número de factura que falta
            String codigoUnico = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            factura.setNumeroFactura("AUTO-" + codigoUnico);
            
            // Guardamos el objeto que ya trae nombre, correo, etc. desde la interfaz
            facturaService.guardar(factura);
            
            System.out.println("✅ Factura guardada para el cliente: " + factura.getNombreCliente());
            
        } catch (Exception e) {
            System.err.println("❌ Error al procesar la factura: " + e.getMessage());
        }
    }
}