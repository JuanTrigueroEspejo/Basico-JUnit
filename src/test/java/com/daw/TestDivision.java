package com.daw;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDivision {
	@BeforeEach
	void setUp() throws Exception {
		 
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}

	 @Test
	 public void testDivision() { 
	 Division d = new Division(2, 3);
	 double resultado = d.dividir();
	 
	 
	 } 

}
