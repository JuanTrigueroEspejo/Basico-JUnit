package com.daw;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class EjemploTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Ejemplo ejemplo = new Ejemplo();
		
		//Cobertura de sentencias
		assertEquals("Hay un error", 1, ejemplo.prueba(1, 1));
		
		//Cobertura de decisiones
		assertEquals("Hay un error", 0, ejemplo.prueba(0, 1));
		
		//Cobertura de condiciones
		assertEquals("Hay un error", 0, ejemplo.prueba(1, 0));
		assertEquals("Hay un error", 1, ejemplo.prueba(0, 0));
				
	}

}
