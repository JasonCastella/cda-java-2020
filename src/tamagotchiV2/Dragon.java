package tamagotchiV2;

public class Dragon extends Tamagotchiv2 {

	public Dragon(String name, String specie, String color) {
		super(name, specie, color);
		this.tall = "3m";
		this.health = 12;
		this.lifeExpectancy = 24;
		this.maxHealth = 12;
	}

	public void feed() {
		super.feed();
		System.out.println("Votre Dragon " + this.name
				+ " vient de dévorer une vache après l'avoir cuit a point... il est rassasié ! ");
	}

	public void toilet() {
		super.toilet();
		System.out.println(
				this.name + " vient de faire ces besoins, c'est fou tout ce qui peut sortir du corps d'un dragon !");
	}

	public void sleep() {
		super.sleep();
		System.out.println(this.name
				+ " se met a souffler sur le sol et se rechauffe un petit coin pour lui, le sol est encore tout chaud... Il s'endort paisiblement et se reveillera en pleine forme !");
	}

	public void wash() {
		super.wash();
		System.out.println(this.name
				+ " fait sa toilette, ca n'a pas l'air bien différent d'un chien ou un chat, c'est juste bien plus impressionant... Il est maintenant tout propre !");
	}

	public void physicalActivity() {
		super.physicalActivity();
		System.out.println(this.name
				+ " prend son envol et va faire une ballade, il en faut de la force pour faire voler une telle masse ! Il gagne 1 point de vie !");
	}

	public void hairDye() {
		super.hairDye();
		System.out.println(
				this.name + " à une envie de se collorer les écailles dorsales, attention tout mais pas roux !");
	}

	public void smoke() {
		super.smoke();
		System.out.println(
				"On dirait comme de la fumée... A prioris, rien de choquant avec un dragon, mais là, c'est une tout autre odeur... On dirait plutot du tabac...\nFaites attention, ce n'est pas bon pour sa santé... "
						+ this.name + " perd 1 point de vie.");
	}

	public void specialAbility() {
		System.out.println("Votre Dragon " + this.name
				+ " prend son envol et tournoi dans les airs en crachant du feu... Quel sublime creature !");
	}

}
