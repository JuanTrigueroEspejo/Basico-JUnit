package com.daw;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestResta {
	@BeforeEach
	void setUp() throws Exception {
		 
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}

	 @Test
	 public void testMultiplicar() { 
	 Resta r = new Resta(2, 3);
	 int resultado = r.restar();
	 
	 }
}
