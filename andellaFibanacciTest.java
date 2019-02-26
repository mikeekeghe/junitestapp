package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class andellaFibanacciTest {

	@Test
	public void fibanacciTest() {
		Andela JUnit = new Andela();
		String result = Andela.fibbanacci(7, 1, 1); 
		assertEquals("{1 , 1 , 2 , 3 , 5 , 8 , 13 , }", result);
	}
	
	@Test
	public void emailCreatorTest() {
		Andela JUnit = new Andela();
		String result = Andela.emailCreator("John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker", "Example");
		assertEquals("doe_john@example.com; parker_peter@example.com; watsonparker_mary@example.com; doe_john2@example.com; doe_john2@example.com; doe_jane@example.com; parker_peter2@example.com; ", result);
	}

}

