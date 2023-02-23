package fr.WoW.model;

public class Guerrier extends Personnage implements Berserker {

	public Guerrier (String race, String name) {
		this(race, name, 1200, 400);
	}
	
	public Guerrier(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	@Override
	public void attack(Personnage p, int damage) {
		p.setHP(p.getHP() - damage);
		System.out.println( this.getName() + " a attaqué  " + p.getName());
	}

	@Override
	public String battleCry() {
		return "Je vais te défoncer ! ";
	}
	
	

}
