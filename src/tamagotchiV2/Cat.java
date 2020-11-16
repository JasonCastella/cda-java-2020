package tamagotchiV2;

public class Cat extends Tamagotchiv2{

	public Cat(String name, String specie, String color) {
		super(name, specie, color);
		this.tall = "20cm";
		this.health = 9;
		this.lifeExpectancy = 18;
		this.maxHealth = 9;
	}

	public void feed() {
		super.feed();
		System.out.println("Votre Chat " + this.name
				+ " réclame ses croquettes, il est tellement mignon qu'on va même lui donner un peu de poisson ! Il est rassasié ! ");
	}

	public void toilet() {
		super.toilet();
		System.out.println(
				this.name + " tourne en rond et gratte partout dans sa litière... Mieux vaut le laisser tranquille !");
	}

	public void sleep() {
		super.sleep();
		System.out.println(this.name
				+ " va dans sa panière et fais une sieste, comme d'habitude quand il sait pas quoi faire quoi. Il s'endort paisiblement et se reveillera en pleine forme !");
	}

	public void wash() {
		super.wash();
		System.out.println(this.name
				+ " se couche et se lèche les pattes avant de se les frotter sur la tête, c'est quand même super propre les chats !");
	}

	public void physicalActivity() {
		super.physicalActivity();
		System.out.println(this.name
				+ " fait un peu d'exercice, aujourd'hui c'est la journée des obstacles ! Il y a 10 sauts à faire ! Il gagne 1 point de vie !");
	}

	public void hairDye() {
		super.hairDye();
		System.out.println(
				this.name + " voudrait se changer les moustaches de couleurs, attention tout mais pas roux !");
	}

	public void smoke() {
		super.smoke();
		System.out.println(
				"Ne me dites pas que vous allez faire fumer un chat quand même !? Ah bah on dirait bien que si ... nFaites attention, ce n'est pas bon pour sa santé... "
						+ this.name + " perd 1 point de vie.");
	}

	public void specialAbility() {
		System.out.println("Votre Chat " + this.name
				+ " se blottit contre vous en ronronnant, qu'est-ce que c'est bon la ronron théraphie !");
	}
	
}
