package tamagotchiV2;

public class Dog extends Tamagotchiv2{

	public Dog(String name, String specie, String color) {
		super(name, specie, color);
		this.tall = "70cm";
		this.health = 9;
		this.lifeExpectancy = 18;
		this.maxHealth = 9;
	}

	public void feed() {
		super.feed();
		System.out.println("Ce soir " + this.name
				+ " c'est le grand soir, paté pour chien avec un petit os gourmand ! Il est rassasié ! ");
	}

	public void toilet() {
		super.toilet();
		System.out.println(
				this.name + " vient de faire ces besoins, n'oubliez pas de nottoyer la cours sinon vous finirez par marcher dessus !");
	}

	public void sleep() {
		super.sleep();
		System.out.println(this.name
				+ " se met dans sa niche sur ses coussins bien confortable... Il s'endort paisiblement et se reveillera en pleine forme !");
	}

	public void wash() {
		super.wash();
		System.out.println(this.name
				+ " fait sa toilette, c'est pas bien passionant mais il faut le faire ! Il est maintenant tout propre !");
	}

	public void physicalActivity() {
		super.physicalActivity();
		System.out.println("C'est l'heure de la balade " + this.name
				+ " un peu d'exercice te feras le plus grand bien ! Il gagne 1 point de vie !");
	}

	public void hairDye() {
		super.hairDye();
		System.out.println(
				this.name + " a une envie de se faire colorer les oreilles, attention tout mais pas roux !");
	}

	public void smoke() {
		super.smoke();
		System.out.println(
				"On dirait comme de la fumée... Et ca sent le tabac... vous ne lui avez quand même pas donné un cigare en douce ?!\nFaites attention, ce n'est pas bon pour sa santé... "
						+ this.name + " perd 1 point de vie.");
	}

	public void specialAbility() {
		System.out.println("Votre Chien " + this.name
				+ " se met à aboyer tout en tourant autour de vous, la queue qui remue dans tous les sens... Puis se couche et se lèche l'arrière train... Génial x) !");
	}
	
}
