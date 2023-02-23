package fr.WoW.domain;

import fr.WoW.model.*;
import fr.WoW.utilitaire.Calcul;

public class Game {

	public static void main(String[] args) {
		
		Personnage[] fighters = new Personnage[5];
		
		//CREATION DE 5 PERSONNAGES
		fighters[0] = new Guerrier("humaine", "Xena");
		fighters[1] = new Mage("humaine", "Merlin");
		fighters[2] = new Soigneur("ninja", "Sakura");
		fighters[3] = new Guerrier("saiyan", "Son Goku");
		fighters[4] = new Mage("sorcier", "Harry Potter");
		
		// CHOISIR LES COMBATTANTS
		int[] Fighters = Calcul.chooseFighter(fighters.length);
		
		// LES COMBATTANTS SONT CHOISIS
		Personnage firstFighter = fighters[Fighters[0]];
		Personnage secFighter = fighters[Fighters[1]];
		
		
		System.out.println(" Start Game  ");
		System.out.println(" gamer " + firstFighter.getName() +  " je suis a " + firstFighter.getClass().getSimpleName());
		System.out.println(" adversaire : " +secFighter.getName() +  " je suis a " + secFighter.getClass().getSimpleName() + " \n");
		
		fight(firstFighter, secFighter);
		
		System.out.println(" Game Over ");
		
	}
		
	/**
	 * FONCTION COMBATS
	 * @param firstFighter
	 * @param secFighter
	 */
	
	
	public static void fight(Personnage firstFighter, Personnage secFighter) {
	

		// TANT QUE LES POINTS DE VIE DE CHAQUE COMBATTANT EST SUPÉRIEUR À 0
		int tour = 1;
		while (firstFighter.getHP() > 0 && secFighter.getHP() > 0) {
			// si nombre de tours impair, le premier combattant joue
			System.out.println(" tour numero " + tour + " START : ");
			System.out.println( firstFighter.getName() + "  : " + firstFighter.battleCry());
			System.out.println( secFighter.getName() + " : "+ secFighter.battleCry());
			if (tour % 2 == 1) {
				play(firstFighter, secFighter);
			} else {
				// sinon c'est le second combattant qui joue
				play(secFighter, firstFighter);
			}

			System.out.println(" tour numero " + tour + " END \n");
			tour++;
		}
		if (firstFighter.getHP() < 0 ) {
			System.out.println(firstFighter.getName() + " est mort ");
		    System.out.println(secFighter.getName() + " win ");
    	}else {
			System.out.println(firstFighter.getName() + " win ");
			System.out.println(secFighter.getName() + " est mort ");
     	}
	}
	
	public static void play(Personnage p, Personnage adversaire) {
		
		switch (p.getClass().getSimpleName()) {
		case "Guerrier" :
			((Guerrier) p).attack(adversaire, 300);
			break;
		case "Mage":
			((Mage) p).attack(adversaire, 270);
			((Mage) p).heal(35);
			break;
		case "Soigneur":
			((Soigneur) p).heal(40);
			break;
		}	
	}

}
