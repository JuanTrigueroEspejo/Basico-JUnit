package com.daw;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMultiplicacion {
	@BeforeEach
	void setUp() throws Exception {
		 
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}

	 @Test
	 public void testMultiplicar() { 
	 Multiplicacion m = new Multiplicacion(2, 3);
	 int resultado = m.multiplicar();
	 assertTrue(resultado == 6);
	 
	 } 

}
