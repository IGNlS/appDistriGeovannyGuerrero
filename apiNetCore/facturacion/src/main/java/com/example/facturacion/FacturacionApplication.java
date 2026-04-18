package com.example.facturacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.rabbit.annotation.EnableRabbit; // <--- ESTA ES LA QUE FALTA

@SpringBootApplication
@EnableRabbit // <--- Ahora ya no saldrá en rojo
public class FacturacionApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacturacionApplication.class, args);
    }
}