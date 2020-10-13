package tamagotchi;

public class Tamagotchi {

	private String name;
	private String specie;
	private String color;
	private String tall = "";
	private int health = 0;
	private int lifeExpectancy = 0;
	private int hungry = 0;
	private int toiletNeed = 0;
	private int tired = 0;
	private int dirty = 0;
	private int socialNeed = 0;
	private int maxHealth = 0;
	private boolean mask = false;

	/**
	 * Constructeur Tamagotchi
	 * 
	 * @param name   son nom
	 * @param specie son type (chien, chat etc...)
	 * @param color  sa couleur
	 */
	public Tamagotchi(String name, String specie, String color) {
		this.name = name;
		this.specie = specie;
		this.color = color;
	}

	/**
	 * permet d'avoir acc�s � lifeExpectancy pour la dur�e de la boucle en fonction
	 * de l'age de l'animal.
	 * 
	 * @return la dur�e de vie de l'animal
	 */
	public int getLife() {
		return lifeExpectancy;
	}

	/**
	 * Permet d'ajouter 1 point de vie au Tamagotchi, sans permettre de d�passer ses
	 * points de vie maximum.
	 */
	public void addHealth() {
		if (this.health + 1 > maxHealth) {
			this.health = maxHealth;
		} else {
			this.health++;
		}
	}

	/**
	 * Permet d'initialiser les caract�ristiques en fonction de l'esp�ce choisie.
	 * 
	 * @param specie type d'animal (chien, chat etc...)
	 */
	public void chosenSpecie(String specie) {
		if (specie.equals("Chien")) {
			initStats("70 cm", 9, 18, 9);
		} else if (specie.equals("Chat")) {
			initStats("20 cm", 9, 18, 9);
		} else if (specie.equals("Ecureuil")) {
			initStats("15 cm", 6, 12, 6);
		} else if (specie.equals("Lapin")) {
			initStats("20 cm", 6, 12, 6);
		} else
			initStats("3 m", 12, 24, 12);
	}

	/**
	 * Permet de d�finir les caract�risiques pour une esp�ce.
	 * 
	 * @param tall   sa taille
	 * @param health ses points de vie
	 * @param lifeEx sa dur�e de vie
	 * @param maxH   ses point de vie max
	 */
	private void initStats(String tall, int health, int lifeEx, int maxH) {
		this.tall = tall;
		this.health = health;
		this.lifeExpectancy = lifeEx;
		this.maxHealth = maxH;
	}

	/**
	 * Affiche les param�tres du Tamagotchi � la cr�ation
	 */
	public void show() {
		System.out.println("C'est un " + specie + " " + color + " qui a pour nom " + name + " et qui mesure environ "
				+ tall + ".");
		System.out.println(
				"Il a " + health + " point de vie, et son esp�rance de vie est de " + lifeExpectancy + " jours.");
	}

	/**
	 * Affiche les param�tres de l'enfant qui vient de naitre
	 */
	public void showJunior() {
		System.out.println(
				"Le petit " + name + " viens de naitre, c'est un magnifique b�b� " + specie + " tout " + color);
	}

	/**
	 * Annonce les besoins du Tamagotchi, et r�agi en fonction de la r�activit� de
	 * l'utilisateur par rapport a ces besoins.
	 * 
	 * @param hungry     jauge app�tit
	 * @param toiletNeed jauge toilette
	 * @param tired      jauge fatigue
	 * @param dirty      jauge hygi�ne
	 * @param socialNeed jauge social
	 */
	public void needs() {
		if (hungry > 7) {
			System.out.println(name + " est affam�, il perd 1 point de vie.");
			health--;
		} else if (hungry > 4) {
			System.out.println(name + " � faim.");
		}
		if (toiletNeed > 7) {
			System.out.println(name + " a fait ses besoins sur lui, il perd 1 point de vie.");
			toiletNeed = 0;
			dirty = 10;
			health--;
		} else if (toiletNeed > 4) {
			System.out.println(name + " doit faire ses besoins.");
		}
		if (tired > 12) {
			System.out.println(name + " s'endort malgr� lui, il perd 1 point de vie.");
			tired = 0;
			hungry++;
			dirty++;
			socialNeed++;
			toiletNeed++;
			health--;
		} else if (tired > 9) {
			System.out.println(name + " est fatigu�, il est temps pour lui de se reposer.");
		}
		if (dirty > 12) {
			System.out.println(name + " n'a toujours pas fait sa toilette, il perd un 1 point de vie.");
			health--;
		} else if (dirty > 9) {
			System.out.println(name + " aimerait faire sa toilette.");
		}
		if (socialNeed > 12) {
			System.out.println(name + " est d�prim�, ses amis lui manque cruellement, il perd 1 point de vie.");
			health--;
		} else if (socialNeed > 9) {
			System.out.println(name + " voudrait aller voir ses amis Tamagothci.");
		}
	}

	/**
	 * Incr�mentation des besoins plac� � la fin de chaques actions
	 */
	public void addNeeds() {
		hungry++;
		toiletNeed++;
		tired++;
		dirty++;
		socialNeed++;
	}

	/**
	 * Action/effet de nourrir
	 */
	public void feed() {
		System.out.println("Vous venez de nourrir " + this.name + ", il est rassasi� !");
		toiletNeed++;
		hungry = 0;
	}

	/**
	 * Action/effet d'aller au WC
	 */
	public void toilet() {
		System.out.println(this.name + " se sent mieux, il avait besoin de se soulager !");
		toiletNeed = 0;
	}

	/**
	 * Action/effet de dormir
	 */
	public void sleep() {
		System.out.println(this.name + " s'endort, paisiblement... puis se r�veille en pleine forme !");
		tired = 0;
	}

	/**
	 * Action/effet de se laver
	 */
	public void wash() {
		System.out.println(
				this.name + " fait sa toilette, c'est quand m�me plus agr�able d'�tre propre et de sentir bon !");
		dirty = 0;
	}

	/**
	 * Action/effet de voir ses amis
	 */
	public void friends() {
		System.out.println(this.name + " va voir ses amis Tamagotchi, c'est bon pour le moral de se sentir entour�.");
		socialNeed = 0;
	}

	/**
	 * Action/Permet au Tamagotchi de se reproduire si appel� dans le switch du
	 * mainscript
	 */
	public void reproduire() {
		System.out.println(
				this.name + " est en train de se reproduire, fermeture du rideau !");
		hungry++;
		tired++;
		dirty++;
	}

	/**
	 * Action/effet de faire du sport
	 */
	public void physicalActivity() {
		System.out.println(this.name
				+ " va faire une s�ance de sport, son odeur en a prit un coup, mais il gagne 1 point de vie !");
		addHealth();
		hungry++;
		tired++;
		dirty = 10;
	}

	/**
	 * Action/effet de la teinture
	 */
	public void hairDye() {
		System.out.println(this.name + " va faire une petite coloration capilaire, attention tout mais pas roux !");
		socialNeed++;
		dirty--;
	}

	/**
	 * Action/effet de fumer
	 */
	public void smoke() {
		System.out.println(this.name
				+ " sort un petit cigare de son dos, et se met � le fumer ! Attention, ce n'est pas bon pour la sant�... "
				+ name + " perd 1 point de vie.");
		hungry++;
		health--;
	}

	/**
	 * Action de l'humeur
	 */
	public void mood() {
		if (health > 0.66 * maxHealth) {
			System.out.println(this.name + " vous regarde amoureusement et vous montre son affection de par sa voix");
		} else if (health <= 0.33 * maxHealth) {
			System.out.println(this.name
					+ " � l'air triste et malheureux, vous devriez essayer de vous occuper un peu plus de ces envies.");
		} else
			System.out.println(
					this.name + " � l'air content, mais ne vous montre pas particuli�rement des signes d'affections");
	}

	/**
	 * Permet d'enlever ou mettre un masque
	 */
	public void mask() {
		if (mask) {
			System.out.println(name + " retire son masque, il semblerait que l'air soit sans danger ici !");
			mask = false;
		} else {
			System.out.println(name + " met son masque, satan� covid-19 !");
			mask = true;
		}
	}

	/**
	 * Permet de mettre fin � la partie, soit parce que les PV ont atteint 0, soit
	 * par la dur�e de vie de l'animal.
	 * 
	 * @param age
	 */
	public void death(int age) {
		if (health <= 0) {
			System.out.println(
					name + " est mort de mani�re pr�matur�e car ses points de vie ont atteint 0.\nPartie termin� !");
			System.exit(-1);
		} else if (age == lifeExpectancy) {
			System.out.println(name
					+ " nous a quitt�... il est mort de veillesse et a eu une belle et heureuse vie � vos cot�s !\nPartie termin� !");
			System.exit(-1);
		}
	}

	/**
	 * Permet � l'utilisateur d'avoir un oeil sur les points de vie � chaque action.
	 */
	public void showHealth() {
		System.out.println(name + " a : " + health + " point de vie.");
	}

	/**
	 * Permet de voir les actions possibles pour l'utilisateur.
	 */
	public void showActions() {
		System.out.println(
				"1-Manger 2-Dormir 3-Laver 4-Toilette 5-Sport 6-Amis 7-Reproduire 8-Humeur 9-Fumer 10-Teinture 11-Enlever/mettre masque");
	}

	/**
	 * Permet d'effetcuer l'action choisie par l'utilisateur.
	 * 
	 * @param action choix de l'utilisateur.
	 */
	public void pickAction(int action) {
		switch (action) {
		case 1:
			this.feed();
			break;
		case 2:
			this.sleep();
			break;

		case 3:
			this.wash();
			break;

		case 4:
			this.toilet();
			break;

		case 5:
			this.physicalActivity();
			break;

		case 6:
			this.friends();
			break;

		case 7:
			this.reproduire();
			break;

		case 8:
			this.mood();
			break;

		case 9:
			this.smoke();
			break;

		case 10:
			this.hairDye();
			break;

		case 11:
			this.mask();
			break;
		default:
			System.out.println("Veuillez entrer une commande entre 1 et 11 !");
		}
	}

}