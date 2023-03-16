package com.epsi.TDD.controller;

import com.epsi.TDD.service.Game;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

	
	@GetMapping()
	public String game() {
		return "La partie commence !";
	}


	private int scoreJoueur = 0; // Initialisation du score du joueur à 0
	private int scoreOrdinateur = 0; // Initialisation du score de l'ordinateur à 0

	@GetMapping("/game/play/{action}")
	public String jouer(@PathVariable String action) {
		String resultat = Game.play(action); // Résultat de la partie
		if (resultat.contains("gagné")) {
			scoreJoueur++; // Incrémenter le score du joueur si le joueur a gagné
		} else if (resultat.contains("perdu")) {
			scoreOrdinateur++; // Incrémenter le score de l'ordinateur si l'ordinateur a gagné
		}
		return resultat + " Votre score est de : " + scoreJoueur + ", Score de l'ordinateur est de : " + scoreOrdinateur; // Retourner le résultat de la partie et les scores
	}

	@PostMapping("/game/restart")
	public void restart() {
		Game.resetScore();
	}
}

