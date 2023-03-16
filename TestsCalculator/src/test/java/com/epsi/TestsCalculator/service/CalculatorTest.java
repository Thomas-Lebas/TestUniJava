package com.epsi.TestsCalculator.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	@Test
	public void test_8_plus_2_equals_10() {
		
		Calculator calc = new Calculator();
		
		int result = calc.add(8, 2);
		
		
		assertEquals(10, result);
	}
	
	
	@Test
	public void test_add_positive_and_negative_numbers() {
		Calculator calc = new Calculator();
		
		int result = calc.add(8, -2);
		
		assertEquals(6, result);
		
	}
	
	@Test
	public void test_add_integer_max_value_plus_1() {
		Calculator calc = new Calculator();
		
		
		assertThrows(ArithmeticException.class, () ->{
			calc.add(Integer.MAX_VALUE, 1);
		});
	}
	
	@Test
	public void test_add_integer_min_value_minus_1() {
		Calculator calc = new Calculator();
		
		
		assertThrows(ArithmeticException.class, () ->{
			calc.add(Integer.MIN_VALUE, -1);
		});
	}
	
	@Test
	public void test_subtracct_positive_and_negative_numbers() {
		
		Calculator calc = new Calculator();

		assertEquals(10, calc.subtract(20, 10));

		assertEquals(20, calc.subtract(10, -10));

		assertEquals(-20, calc.subtract(-10, 10));
		
	}
	
	@Test
	public void test_assert_exception_when_over_integer_max_and_min() {
		
		Calculator calc = new Calculator();

		assertThrows(ArithmeticException.class, ()->{
			calc.subtract(Integer.MIN_VALUE, 1);
		});
		
		assertThrows(ArithmeticException.class, ()->{
			calc.subtract(Integer.MAX_VALUE, -1);
		});
		
	}
	
}
