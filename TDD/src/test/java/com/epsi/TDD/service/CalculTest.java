package com.epsi.TDD.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculTest {


	@Test
	public void assert_exception_if_param_is_null_or_empty() {
		
		assertThrows(Exception.class, ()->{
			Calcul.expression(null);
		});
		
		assertThrows(Exception.class, ()->{
			Calcul.expression("");
		});
		
		
	}
	
	@Test
	public void test_that_8_return_8() throws Exception {
		
		assertEquals(8, Calcul.expression("8"));
	}
	
	
	@Test
	public void test_that_6_return_6() throws Exception {
		
		assertEquals(6, Calcul.expression("6"));
	}
	
	@Test
	public void test_that_6plus6_return_12() throws Exception {
		assertEquals(12, Calcul.expression("6+6"));
	}
	
	@Test
	public void test_that_6minus6_return_0() throws Exception {
		assertEquals(0, Calcul.expression("6-6"));
	}
	
	@Test
	public void test_that_6multiply6_return_36() throws Exception {
		assertEquals(36, Calcul.expression("6*6"));
	}
	
	@Test
	public void test_that_6divide6_return_1() throws Exception {
		assertEquals(1, Calcul.expression("6/6"));
	}
	
	@Test
	public void test_that_6divide6plus2_return_1() throws Exception {
		assertEquals(3, Calcul.expression("6/6+2"));
	}
	
	@Test
	public void test_multiplication_and_division() throws Exception {
		assertEquals(6, Calcul.expression("6*6/6"));
	}
	
	
	@Test
	public void test_multiplication_and_adition() throws Exception {
		assertEquals(50, Calcul.expression("3+3+4*5"));
	}
	
}
