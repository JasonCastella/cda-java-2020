package tamagotchi;

public class Tamagotchi {

	private String name;
	private String specie;
	private String color;
	private String tall;
	private int health;
	private int lifeExpectancy;

	public Tamagotchi() {
		
	}
	
	public Tamagotchi(String name, String specie, String color, String tall, int health, int lifeExpectancy) {
		this.name = name;
		this.specie = specie;
		this.color = color;
		this.tall = tall;
		this.health = health;
		this.lifeExpectancy = lifeExpectancy;
	}

	public int getLife() {
		return lifeExpectancy;
	}
	
	public void chosenSpecie(String specie) {
		if (specie.equals("Chien")) {
			dogStats();
		} else if (specie.equals("Chat")) {
			catStats();
		} else if (specie.equals("Ecureuil")) {
			squirrelStats();
		} else if (specie.equals("Lapin")) {
			rabbitStats();
		} else
			dragonStats();
	}

	public void dogStats() {
		this.tall = "70cm";
		this.health = 5;
		this.lifeExpectancy = 15;
	}

	public void catStats() {
		this.tall = "20cm";
		this.health = 5;
		this.lifeExpectancy = 15;
	}

	public void squirrelStats() {
		this.tall = "15cm";
		this.health = 4;
		this.lifeExpectancy = 10;
	}

	public void rabbitStats() {
		this.tall = "20cm";
		this.health = 4;
		this.lifeExpectancy = 10;
	}

	public void dragonStats() {
		this.tall = "3m";
		this.health = 10;
		this.lifeExpectancy = 30;
	}

	public void show() {
		System.out.println("C'est un " + specie + " qui a pour nom " + name + ",");
		System.out.println("Il est " + color + " et mesure environ " + tall + ",");
		System.out.println(
				"Il a " + health + " point de vie, et son espérance de vie est de " + lifeExpectancy + " jours.");
	}

	public void feed() {
		System.out.println("Vous venez de nourrir " + this.name + ", il est rassasié !");
	}

	public void hungry() {

	}

	public void toilet() {
		System.out.println(this.name + " se sent mieux, il avait besoin de faire ses besoins !");
	}

	public void toiletNeeds() {

	}

	public void sleep() {
		System.out.println(this.name + " est extenué, il est temps pour lui de faire dodo");
	}

	public void tired() {

	}

	public void wash() {
		System.out.println(this.name + " fait sa toilette, c'est agréable d'être propre quand même... ");
	}

	public void dirty() {

	}

	public void friends() {
		
	}

	public void sex() {

	}

	public void socialNeeds() {

	}

	public void physicalActivity() {

	}

	public void hairDye() {

	}

	public void mood() {

	}

	public void death() {

	}

	public void showHealth() {
		System.out.println("Il reste " + health + " point de vie a votre Tamagotchi.");
	}

	public void showActions() {
		System.out.println("Manger\nDormir\nSe Laver\nFaire ses besoins\nFaire de l'exercice\nAller voir des amis\nSe reproduire\nExprimer son humeur\nEnlever ou mettre un masque\nSe teindre les cheveux");
	}
	
}