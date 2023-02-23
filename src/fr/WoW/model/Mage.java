package fr.WoW.model;

public class Mage extends Personnage implements Berserker, Healer{

	public Mage(String race, String name) {
		this(race, name, 1000, 500);
	}
	
	public Mage(String race, String name, int HP, int MP) {
		super(race, name, HP, MP);
	}
	
	@Override
	public void heal(int restore) {
		this.setHP(this.getHP() + restore);
		System.out.println( this.getName() + " restore  " + this.getHP() + " points");
	}

	@Override
	public void attack(Personnage p, int damage) {
		p.setHP(p.getHP() - damage);
		System.out.println( this.getName() + " a attaqué  " + p.getName());
		System.out.println( p.getName() + " a perdu  " + p.getHP() + " points");
	}

	@Override
	public String battleCry() {
		return "Avada Kedavra !";
	}

}
