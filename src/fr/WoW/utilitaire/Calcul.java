package fr.WoW.utilitaire;

import java.util.Random;

public class Calcul {
	
	/**
	 * FONCTION CHOIX COMBATTANT
	 * @param fighters
	 * @return
	 */	
	public static int[] chooseFighter(int nbFighters) {
		int[] a= new int[2];
		Random rand = new Random();
		a[0] = rand.nextInt(nbFighters);
		a[1] = rand.nextInt(nbFighters);
		return a;
		
	}
	
}
