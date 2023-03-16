package com.epsi.TDD.service;

import java.util.Random;

public class Game {

	public static String play(String action) {
		Random rand = new Random();
		String[] choix = {"pierre", "feuille", "ciseaux"};
		int index = rand.nextInt(choix.length);
		String choixOrdinateur = choix[index];

		if (!isValidAction(action)) {
			return "Action invalide";
		}

		if (action.equals(choixOrdinateur)) {
			return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez fait égalité.";
		} else if (action.equals("pierre")) {
			if (choixOrdinateur.equals("ciseaux")) {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez gagné !";
			} else {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez perdu...";
			}
		} else if (action.equals("feuille")) {
			if (choixOrdinateur.equals("pierre")) {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez gagné !";
			} else {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez perdu...";
			}
		} else if (action.equals("ciseaux")) {
			if (choixOrdinateur.equals("feuille")) {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez gagné !";
			} else {
				return "Vous avez joué " + action + ", l'ordinateur à joué " + choixOrdinateur + ", vous avez perdu...";
			}
		} else {
			return "Veuillez entrer pierre, feuille ou ciseaux.";
		}
	}

	private static boolean isValidAction(String action) {
		return action.equalsIgnoreCase("pierre") ||
				action.equalsIgnoreCase("feuille") ||
				action.equalsIgnoreCase("ciseaux");
	}
}