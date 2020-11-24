package tp8TableauxObjet;

import outils.Clavier;

public class MainDragon {

	public static void main(String[] args) {

		int nb;
		String sexe;
		char sexe1 = '\u0000';
		String crache;
		boolean crache1 = false;

		System.out.println("Combien de dragon voulez vous saisir ?");
		nb = Clavier.lireInt();
		Dragon[] tabDragon = new Dragon[nb];
		for (int i = 0; i < tabDragon.length; i++) {
			Dragon dragon = new Dragon();
			System.out.println("Dragon numéro : " + (i + 1));
			dragon.setIndex(i + 1);

			System.out.println("Nom : ");
			dragon.setNom(Clavier.lireString());

			do {
				System.out.println("Sexe : (tappez M pour masculin ou F pour féminin)");
				sexe = Clavier.lireString();
				// sexe.charAt(0)
				if (sexe.equals("M")) {
					sexe1 = 'M';
				} else if (sexe.equals("F")) {
					sexe1 = 'F';
				}
			} while (sexe1 == '\u0000');
			dragon.setSexe(sexe1);

			System.out.println("Longueur : ");
			dragon.setLongueur(Clavier.lireInt());

			System.out.println("Nombre d'écailles : ");
			dragon.setNbEcaille(Clavier.lireInt());

			do {
				System.out.println("Peut-il cracher du feu ? (Tappez oui ou non)");
				crache = Clavier.lireString();
				// crache1=crache.equals("oui");
				if (crache.equals("oui")) {
					crache1 = true;
				} else if (crache.equals("non")) {
					crache1 = false;
				}
			} while (!crache.equals("oui") & !crache.equals("non"));
			dragon.setCrache(crache1);

			System.out.println("Trait de caractère : ");
			dragon.setComportement(Clavier.lireString());

			tabDragon[i] = dragon;
			System.out.println("");
		}

		afficheDragon(tabDragon);
		// afficheLePlusGrand(tabDragon, lePlusGrand(tabDragon));

	}

	public static void afficheDragon(Dragon[] tab) {
		for (Dragon dragon : tab) {
			System.out.println("");
			System.out.println("Dragon numéro : " + dragon.getIndex());
			System.out.println("Nom : " + dragon.getNom());
			System.out.println("Sexe : " + dragon.getSexe());
			System.out.println("Longueur : " + dragon.getLongueur());
			System.out.println("Nombre d'écailles : " + dragon.getNbEcaille());
			System.out.println("Crache du feu : " + dragon.isCrache());
			System.out.println("Trait de caractère : " + dragon.getComportement());
		}
	}

	public static int lePlusGrand(Dragon[] tab) {
		int positionDragon = 0;
		int max = 0;
		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i].getLongueur()) {
				max = tab[i].getLongueur();
				positionDragon = i;
			}
		}
		return positionDragon;
	}

	public static void afficheLePlusGrand(Dragon[] tab, int positionDragon) {
		System.out.println("Le dragon le plus grand est : " + tab[positionDragon].getNom());
	}
}
