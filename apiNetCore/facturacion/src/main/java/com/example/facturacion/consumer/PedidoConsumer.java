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

    @RabbitListener(queues = "pedidoEvent")
    public void recibirPedido(Factura factura) {
        System.out.println("📩 ¡Mensaje detectado en la cola!");
        try {
            if (factura == null) return;
            
            if (factura.getNumeroFactura() == null) {
                String codigo = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
                factura.setNumeroFactura("IGNIS-" + codigo);
            }
            
            facturaService.guardar(factura);
            System.out.println("✅ Factura guardada para: " + factura.getNombreCliente());
        } catch (Exception e) {
            System.err.println("❌ Error al procesar: " + e.getMessage());
        }
    }
}