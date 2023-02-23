package fr.WoW.model;

public class Soigneur extends Personnage implements Healer {

	
	public Soigneur (String race, String name) {
		this(race, name, 850, 600);
	}
	
	public Soigneur(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	@Override
	public void heal(int restore) {
		this.setHP(this.getHP() + restore);
		System.out.println( this.getName() + " restore  " + this.getHP() + " points");
	}

	@Override
	public String battleCry() {
		return "Je viens te sauver !";
	}

}
