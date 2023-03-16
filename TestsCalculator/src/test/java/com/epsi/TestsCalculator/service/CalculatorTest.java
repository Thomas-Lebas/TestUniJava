package com.epsi.TestsCalculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

	
	Calculator calc;
	
	@BeforeAll
	public void init_calc() {
		calc = new Calculator();
		System.out.println("In Before All");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("In After All");
	}
	
	@BeforeEach
	public void beforeEach(TestInfo testInfo) {
		
		System.out.println("Executing : " + testInfo.getDisplayName());
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("In After Each");
	}
	
	
	@Test
	public void test_8_plus_2_equals_10() {
				
		int result = this.calc.add(8, 2);
		
		
		assertEquals(10, result);
	}
	
	
	@Test
	public void test_add_positive_and_negative_numbers() {
		
		int result = calc.add(8, -2);
		
		assertEquals(6, result);
		
	}
	
	@Test
	public void test_add_integer_max_value_plus_1() {
		
		
		assertThrows(ArithmeticException.class, () ->{
			calc.add(Integer.MAX_VALUE, 1);
		});
	}
	
	@Test
	public void test_add_integer_min_value_minus_1() {
		
		
		assertThrows(ArithmeticException.class, () ->{
			calc.add(Integer.MIN_VALUE, -1);
		});
	}
	
	@Test
	public void test_subtracct_positive_and_negative_numbers() {
		
		assertEquals(10, calc.subtract(20, 10));

		assertEquals(20, calc.subtract(10, -10));

		assertEquals(-20, calc.subtract(-10, 10));
		
	}
	
	@Test
	public void test_assert_exception_when_over_integer_max_and_min() {
		

		assertThrows(ArithmeticException.class, ()->{
			calc.subtract(Integer.MIN_VALUE, 1);
		});
		
		assertThrows(ArithmeticException.class, ()->{
			calc.subtract(Integer.MAX_VALUE, -1);
		});
		
	} 
	
	@ParameterizedTest
	@CsvSource( value = {"9:3:3","15:5:3"}, delimiter = ':')
	public void test_multiply(int excepted, int a, int b) {

		assertEquals(excepted, calc.multiply(a, b));
	}
	
	@Test
	public void test_multiply_over_max_int() {

		assertThrows(ArithmeticException.class, ()->{
			
			calc.multiply(100000, 10000000);
			
		});
	}
	
	@ParameterizedTest
	@CsvSource( value = {"2,6,3","-2,-6,3", "3,-9,-3"})
	public void test_divide(int excepted, int a, int b) {
		
		assertEquals(excepted, calc.divide(a, b));
	}
	
	
	@Test
	public void test_divide_by_zero() {
		assertThrows(ArithmeticException.class, ()->{
			calc.divide(80, 0);
		});
	}

}
