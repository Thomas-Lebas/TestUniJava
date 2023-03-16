package com.epsi.TDD.service;

public final class FizzBuzz {

	
	public static String play(int number) {
//		return number%15==0?"fizzbuzz":number%5==0?"buzz":number%3==0?"fizz":Integer.toString(number);
		
		if (number % 15 == 0 ) {
			return "fizzbuzz";
		}
		if(number % 5 == 0) {
			return "buzz";
		}
		if (number % 3 == 0) {
			return "fizz";
		}
		return Integer.toString(number);
	}
}
  