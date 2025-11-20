package com.blumbit.compras_ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ComprasVentasApplication {

	//Camel case: comprasVentas
	//Pascal case: ComprasVentas
	//snack case: compras_ventas

	public static void main(String[] args) {
		SpringApplication.run(ComprasVentasApplication.class, args);
	}

}
