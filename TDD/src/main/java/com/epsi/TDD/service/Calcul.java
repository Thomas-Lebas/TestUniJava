package com.epsi.TDD.service;

import java.util.Iterator;

public class Calcul {

	
	public static int expression(String expr) throws Exception {
		
		if (expr == null || expr == "") {
			throw new Exception();
		}
		
		int nombre = 0;
		char operateur = '+';
		
		if (expr.length() > 1) {
			
			for(int i = 0; i < expr.length(); i++) {
				
				char c = expr.charAt(i);
				
				if (Character.isDigit( c )) {
					nombre = operation(nombre, operateur, Integer.parseInt( String.valueOf(c))  );
				} else {
					operateur = c;
				}
			}
			return  nombre;
		}
		return Integer.valueOf(expr);
	}
	
	
	
	private static int operation(int a, char operateur, int b) {
		switch (operateur) {
		case '+': {
			return a+ b;
		}
		case '-': {
			return a - b;
		}
		case '*': {
			return a * b;
		}
		case '/': {
			return a / b;
		}
		
		default:
			throw new IllegalArgumentException(String.valueOf(operateur));
		}
	}
	
	
}
