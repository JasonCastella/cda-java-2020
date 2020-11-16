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
				+ " r�clame ses croquettes, il est tellement mignon qu'on va m�me lui donner un peu de poisson ! Il est rassasi� ! ");
	}

	public void toilet() {
		super.toilet();
		System.out.println(
				this.name + " tourne en rond et gratte partout dans sa liti�re... Mieux vaut le laisser tranquille !");
	}

	public void sleep() {
		super.sleep();
		System.out.println(this.name
				+ " va dans sa pani�re et fais une sieste, comme d'habitude quand il sait pas quoi faire quoi. Il s'endort paisiblement et se reveillera en pleine forme !");
	}

	public void wash() {
		super.wash();
		System.out.println(this.name
				+ " se couche et se l�che les pattes avant de se les frotter sur la t�te, c'est quand m�me super propre les chats !");
	}

	public void physicalActivity() {
		super.physicalActivity();
		System.out.println(this.name
				+ " fait un peu d'exercice, aujourd'hui c'est la journ�e des obstacles ! Il y a 10 sauts � faire ! Il gagne 1 point de vie !");
	}

	public void hairDye() {
		super.hairDye();
		System.out.println(
				this.name + " voudrait se changer les moustaches de couleurs, attention tout mais pas roux !");
	}

	public void smoke() {
		super.smoke();
		System.out.println(
				"Ne me dites pas que vous allez faire fumer un chat quand m�me !? Ah bah on dirait bien que si ... nFaites attention, ce n'est pas bon pour sa sant�... "
						+ this.name + " perd 1 point de vie.");
	}

	public void specialAbility() {
		System.out.println("Votre Chat " + this.name
				+ " se blottit contre vous en ronronnant, qu'est-ce que c'est bon la ronron th�raphie !");
	}
	
}
