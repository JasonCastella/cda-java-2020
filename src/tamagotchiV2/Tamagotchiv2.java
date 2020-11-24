package tamagotchiV2;

public abstract class Tamagotchiv2 {

	protected String name;
	protected String specie;
	protected String color;
	protected String tall = "";
	protected int health = 0;
	protected int lifeExpectancy = 0;
	protected int hungry = 0;
	protected int toiletNeed = 0;
	protected int tired = 0;
	protected int dirty = 0;
	protected int socialNeed = 0;
	protected int maxHealth = 0;
	protected boolean mask = false;

	/**
	 * Constructeur Tamagotchi
	 * 
	 * @param name   son nom
	 * @param specie son type (chien, chat etc...)
	 * @param color  sa couleur
	 */
	public Tamagotchiv2(String name, String specie, String color) {
		this.name = name;
		this.specie = specie;
		this.color = color;
	}

	/**
	 * Permet d'avoir accés à lifeExpectancy pour la durée de la boucle en fonction
	 * de l'age de l'animal.
	 * 
	 * @return la durée de vie de l'animal
	 */
	public int getLife() {
		return lifeExpectancy;
	}

	/**
	 * Permet d'ajouter 1 point de vie au Tamagotchi, sans permettre de dépasser ses
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
	 *Affiche les paramètres du Tamagotchi à la création
	 */
	public void show() {
		System.out.println("C'est un " + specie + " " + color + " qui a pour nom " + name + " et qui mesure environ "
				+ tall + ".");
		System.out.println(
				"Il a " + health + " point de vie, et son espérance de vie est de " + lifeExpectancy + " jours.");
	}

	/**
	 * Affiche les paramètres de l'enfant qui vient de naitre
	 */
	public void showJunior() {
		System.out.println(
				"Le petit " + name + " viens de naitre, c'est un magnifique bébé " + specie + " tout " + color);
	}

	/**
	 * Annonce les besoins du Tamagotchi, et réagi en fonction de la réactivité de
	 * l'utilisateur par rapport a ces besoins.
	 * 
	 * @param hungry     jauge appétit
	 * @param toiletNeed jauge toilette
	 * @param tired      jauge fatigue
	 * @param dirty      jauge hygiène
	 * @param socialNeed jauge social
	 */
	public void needs() {
		if (hungry > 7) {
			System.out.println(name + " est affamé, il perd 1 point de vie.");
			health--;
			deathTest();
		} else if (hungry > 4) {
			System.out.println(name + " à faim.");
		}
		if (toiletNeed > 7) {
			System.out.println(name + " a fait ses besoins sur lui, il perd 1 point de vie.");
			toiletNeed = 0;
			dirty = 10;
			health--;
			deathTest();
		} else if (toiletNeed > 4) {
			System.out.println(name + " doit faire ses besoins.");
		}
		if (tired > 12) {
			System.out.println(name + " s'endort malgrè lui, il perd 1 point de vie.");
			tired = 0;
			hungry++;
			dirty++;
			socialNeed++;
			toiletNeed++;
			health--;
			deathTest();
		} else if (tired > 9) {
			System.out.println(name + " est fatigué, il est temps pour lui de se reposer.");
		}
		if (dirty > 12) {
			System.out.println(name + " n'a toujours pas fait sa toilette, il perd un 1 point de vie.");
			health--;
			deathTest();
		} else if (dirty > 9) {
			System.out.println(name + " aimerait faire sa toilette.");
		}
		if (socialNeed > 12) {
			System.out.println(name + " est déprimé, ses amis lui manque cruellement, il perd 1 point de vie.");
			health--;
			deathTest();
		} else if (socialNeed > 9) {
			System.out.println(name + " voudrait aller voir ses amis Tamagothci.");
		}
	}

	/**
	 * Incrémentation des besoins, placé en fin de boucle pour une itération après
	 * chaque action
	 */
	public void addNeeds() {
		hungry++;
		toiletNeed++;
		tired++;
		dirty++;
		socialNeed++;
	}

	/**
	 * Action : nourrir
	 */
	public void feed() {
		toiletNeed++;
		hungry = 0;
	}

	/**
	 * Action : aller au WC
	 */
	public void toilet() {
		toiletNeed = 0;
	}

	/**
	 * Action : dormir
	 */
	public void sleep() {
		tired = 0;
	}

	/**
	 * Action : se laver
	 */
	public void wash() {
		dirty = 0;
	}

	/**
	 * Action : voir ses amis
	 */
	public void friends() {
		System.out.println(this.name + " va voir ses amis Tamagotchi, c'est bon pour le moral de se sentir entouré.");
		socialNeed = 0;
	}

	/**
	 * Action : se reproduire, création d'un nouveau Tamagochi de la meme
	 * espèce/couleur
	 */
	public void reproduction() {
		System.out.println(this.name + " à trouvé un congénère pour se reproduire et a besoin d'intimité...");
		tired++;
		dirty++;
		hungry++;
	}

	/**
	 * Action : faire du sport
	 */
	public void physicalActivity() {
		addHealth();
		hungry++;
		tired++;
		dirty = 10;
	}

	/**
	 * Action : faire une couleur
	 */
	public void hairDye() {
		socialNeed++;
		dirty--;
	}

	/**
	 * Action : fumer
	 */
	public void smoke() {
		hungry++;
		health--;
	}

	public abstract void specialAbility();
	
	/**
	 * Action : humeur
	 */
	public void mood() {
		if (health > 0.66 * maxHealth) {
			System.out.println(this.name + " vous regarde amoureusement et vous montre son affection de par sa voix");
		} else if (health <= 0.33 * maxHealth) {
			System.out.println(this.name
					+ " à l'air triste et malheureux, vous devriez essayer de vous occuper un peu plus de ces envies.");
		} else
			System.out.println(
					this.name + " à l'air content, mais ne vous montre pas particulièrement des signes d'affections");
	}

	/**
	 * Action : enlever ou mettre un masque
	 */
	public void mask() {
		if (mask) {
			System.out.println(name + " retire son masque, il semblerait que l'air soit sans danger ici !");
			mask = false;
		} else {
			System.out.println(name + " met son masque, satané covid-19 !");
			mask = true;
		}
	}

	/**
	 * Met fin à la partie quand la durée de vie du Tamagotchi est atteinte.
	 */
	public void naturalDeath() {
		System.out.println(this.name
				+ " s'endort profondémment, mais ne se reveillera pas... Vous vous êtes bien occupé de votre Tamagotchi.\n"
				+ this.name
				+ " a eu une belle et heureuse vie à vos cotés, et repose maintenant en paix...\nPartie terminé !");
		System.exit(-1);
	}

	/**
	 * Test les points de vie du Tamagotchi, dès que les points de vie atteignent 0,
	 * la partie s'arrête.
	 */
	public void deathTest() {
		if (health <= 0) {
			System.out.println("Les points de vie de votre Tamagotchi ont atteint 0, " + this.name
					+ " est mort de manière prématurée car vous ne vous êtes pas bien occupé de lui...\nPartie terminé !");
			System.exit(-1);
		}
	}

	/**
	 * Permet à l'utilisateur d'avoir un oeil sur les points de vie à chaque action.
	 */
	public void showHealth() {
		System.out.println(name + " a : " + health + " point de vie.");
	}

	/**
	 * Permet de voir les actions possibles pour l'utilisateur.
	 */
	public void showActions() {
		System.out.println(
				"1-Manger  2-Dormir  3-Laver  4-WC  5-Sport  6-Amis  7-Reproduire  8-Humeur  9-Fumer  10-Teinture  11-Enlever/mettre masque 12-Capacité Spéciale");
	}

	/**
	 * Affiche les paramètres du Tamagotchi à la création.
	 */
	public void showTam() {
		System.out.println("C'est un " + specie + " " + color + " qui a pour nom " + name + " et qui mesure environ "
				+ tall + ".");
		System.out.println(
				"Il a " + health + " point de vie, et son espérance de vie est de " + lifeExpectancy + " jours.");
	}

	/**
	 * Introduit le nouveau Tamagochi enfant.
	 */
	public void showBaby() {
		System.out.println("Il semblerait que la tentative de reproduction soit un succès !");
		System.out
				.println("Je vous présente " + this.name + ", un joli petit " + this.specie + " " + this.color + " !");
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
			this.reproduction();
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
		case 12:
			this.specialAbility();
			break;
		default:
			System.out.println("Veuillez entrer une commande entre 1 et 12 !");
		}
	}

}