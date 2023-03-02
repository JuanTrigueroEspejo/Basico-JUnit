package com.daw;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuma {
	public Suma suma;
	@Before
	public void antesDelTest() {
	/**
	El metodo precedido por la etiqueta @Before
	es para indicar a JUnit que debe ejecutarlo
	antes de ejecutar los Tests que figuran en
	esta clase.
	*/
	this.suma = new Suma(3, 5);
	}
	@After
	public void despuesDelTest() {
	/**
	La etiqueta @After es la antítesis de @Before.
	Simplemente este metodo se ejecutara despues de
	ejecutar todos los tests de esta clase.
	*/
	// en este caso no hago nada, solo esta de ejemplo
	}
	@Test
	public void testSuma() {
	/**
	Marcais el metodo con la etiqueta @Test y es
	importante que el nombre del metodo comience
	siempre por test.
	*/
	int resultado = this.suma.sumar();
	// con esto verificamos que el resultado es el esperado
	assertTrue(resultado == 8);
	}
	} 

