package com.teste.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teste.calculadora.service.CalculadoraService;

@SpringBootApplication
public class CalculadoraApplication {	

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);	
		
		CalculadoraService calculadoraService = new CalculadoraService();
		
        System.out.println("Resultado da divisão: "+ calculadoraService.dividir(2, 2));
	
	}	

}
