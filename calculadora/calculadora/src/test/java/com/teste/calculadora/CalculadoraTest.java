package com.teste.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.teste.calculadora.service.CalculadoraService;

@SpringBootTest
public class CalculadoraTest {
	
	@Autowired
	private CalculadoraService calculadoraService;	
	
//	CalculadoraService calculadoraService = new CalculadoraService();
	
	@Test
	public void testAdicaoCalculadora() {
	    double esperado = calculadoraService.somar(2.5, 2);
    
	    assertEquals(4.5,esperado);  
	}
	
	@Test
	public void testSubtracaoCalculadora() {
	    double esperado = calculadoraService.subtrair(2,2);
	    
	    assertEquals(0, esperado); 
	}
	
	@Test
	public void testMultiplicaoCalculadora() {
	    double esperado = calculadoraService.multiplicar(2,2);
	    assertEquals(4, esperado); 
	}
	
//	@Test
//	public void testDivisaoCalculadora() {
//	    IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> calculadoraService.dividir(2,0));
//	    
//	    assertEquals("não pode dividr com zero", exception.getMessage()); 
//	}
	
	

}
