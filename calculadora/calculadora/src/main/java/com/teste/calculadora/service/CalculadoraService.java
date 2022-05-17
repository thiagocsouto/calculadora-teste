package com.teste.calculadora.service;

import org.springframework.stereotype.Service;

import com.teste.calculadora.entity.Calculadora;


@Service
public class CalculadoraService { 
	
	public double somar(double valor1, double valor2){	
        return valor1 + valor2;
    } 
	
	public double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }
	
	public double dividir(double valor1, double valor2){
		
		if (valor2 == 0) {
			throw new IllegalArgumentException("não pode dividr com zero");
		}
        return valor1 / valor2;
    }
	
	public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
	
}
