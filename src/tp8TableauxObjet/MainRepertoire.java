package tp8TableauxObjet;

import outils.Clavier;

public class MainRepertoire {

	public static void main(String[] args) {
		
		int nb;
		String nom;
		String prenom;
		String adresse;
		int codePostal;
		String ville;
		int age;

		System.out.println("Combien de personnes � saisir ?");
		nb = Clavier.lireInt();
		Repertoire[] tabPersonne = new Repertoire[nb];
		System.out.println("Veuillez renseigner les informations...");
		for (int i = 0; i < nb; i++) {
			Repertoire rep = new Repertoire();
			System.out.println("Personne : " + (i + 1));
			rep.setIndex(i + 1);

			System.out.println("Nom : ");
			nom = Clavier.lireString();
			rep.setNom(nom);

			System.out.println("Prenom : ");
			prenom = Clavier.lireString();
			rep.setPrenom(prenom);

			System.out.println("Adresse : ");
			adresse = Clavier.lireString();
			rep.setAdresse(adresse);

			System.out.println("Code Postal : ");
			codePostal = Clavier.lireInt();
			rep.setCodePostal(codePostal);

			System.out.println("Ville : ");
			ville = Clavier.lireString();
			rep.setVille(ville);

			System.out.println("Age : ");
			age = Clavier.lireInt();
			rep.setAge(age);

			tabPersonne[i] = rep;

			System.out.println("");
		}

		// afficheTout(tabPersonne);
		affichePlusAg�e(tabPersonne, testPlusAg�e(tabPersonne));

	}

	public static void afficheTout(Repertoire[] tab) {
		for (Repertoire rep : tab) {
			System.out.println("");
			System.out.println("Informations personne num�ro : " + rep.getIndex());
			System.out.println("Nom : " + rep.getNom());
			System.out.println("Prenom : " + rep.getPrenom());
			System.out.println("Adresse : " + rep.getAdresse());
			System.out.println("Code Postal : " + rep.getCodePostal());
			System.out.println("Ville : " + rep.getVille());
			System.out.println("Age : " + rep.getAge());
		}
	}

	public static int testPlusAg�e(Repertoire[] tab) {
		int positionPlusAg�e = 0;
		int agePlusElev�e = 0;
		for (int i = 0; i < tab.length; i++) {
			if (agePlusElev�e < tab[i].getAge()) {
				agePlusElev�e = tab[i].getAge();
				positionPlusAg�e = i;
			}
		}
		return positionPlusAg�e;
	}

	public static void affichePlusAg�e(Repertoire[] tab, int indice) {
		System.out.println("Voici les informations de la personne la plus ag�e :");
		System.out.println("Personne num�ro : " + tab[indice].getIndex());
		System.out.println("Nom : " + tab[indice].getNom());
		System.out.println("Prenom : " + tab[indice].getPrenom());
		System.out.println("Adresse : " + tab[indice].getAdresse());
		System.out.println("Code Postal : " + tab[indice].getCodePostal());
		System.out.println("Ville : " + tab[indice].getVille());
		System.out.println("Age : " + tab[indice].getAge());

	}
}
