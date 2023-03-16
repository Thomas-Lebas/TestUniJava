package com.epsi.TDD.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

	@Test
	public void testJouerPierre() {
		String resultat = Game.play("pierre");
		assertTrue(resultat.contains("fait égalité") || resultat.contains("gagné") || resultat.contains("perdu"));
	}

	@Test
	public void testJouerFeuille() {
		String resultat = Game.play("feuille");
		assertTrue(resultat.contains("fait égalité") || resultat.contains("gagné") || resultat.contains("perdu"));
	}

	@Test
	public void testJouerCiseaux() {
		String resultat = Game.play("ciseaux");
		assertTrue(resultat.contains("fait égalité") || resultat.contains("gagné") || resultat.contains("perdu"));
	}

	@Test
	public void testJouerActionInvalide() {
		String resultat = Game.play("foo");
		assertEquals("Action invalide", resultat);
	}

	@Test
	void testResetScore() {
		Game.play("pierre");
		Game.play("ciseaux");

		Game.resetScore();

		assertEquals(0, Game.getPlayerScore());
		assertEquals(0, Game.getComputerScore());
	}
}