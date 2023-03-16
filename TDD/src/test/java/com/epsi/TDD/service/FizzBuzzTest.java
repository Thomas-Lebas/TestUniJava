package com.epsi.TDD.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void test_fizz_buzz_one() {
		assertEquals("1", FizzBuzz.play(1));
	}
	
	@Test
	public void test_fizz_bizz_8() {
		assertEquals("8", FizzBuzz.play(8));		
	}
	
	
	@Test
	public void test_fizz_buzz_3_return_fizz() {
		assertEquals("fizz", FizzBuzz.play(3));				
	}
	 
	@Test
	public void test_fizz_buzz_21_return_fizz() { 
		assertEquals("fizz", FizzBuzz.play(21));				
	}
	
	@Test
	public void test_fizz_buzz_5_return_buzz() {
		assertEquals("buzz", FizzBuzz.play(5));				
	}
	
	
	@Test
	public void test_fizz_buzz_50_return_buzz() {
		assertEquals("buzz", FizzBuzz.play(50));				
	}
	
	@Test
	public void test_fizz_buzz_15_return_fizz_buzz() {
		assertEquals("fizzbuzz", FizzBuzz.play(15));				
	} 
	
	@Test
	public void test_fizz_buzz_45_return_fizz_buzz() {
		assertEquals("fizzbuzz", FizzBuzz.play(45));				
	} 
	
}
