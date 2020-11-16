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

		System.out.println("Combien de personnes à saisir ?");
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
		}

		afficheOlder(tabPersonne);

	}

	public static void afficheAll(Repertoire[] tab) {
		for (Repertoire rep : tab) {
			System.out.println("");
			System.out.println("Informations personne numéro : " + rep.getIndex());
			System.out.println("Nom : " + rep.getNom());
			System.out.println("Prenom : " + rep.getPrenom());
			System.out.println("Adresse : " + rep.getAdresse());
			System.out.println("Code Postal : " + rep.getCodePostal());
			System.out.println("Ville : " + rep.getVille());
			System.out.println("Age : " + rep.getAge());
		}
	}

	public static void afficheOlder(Repertoire[] tab) {
		int x = 0;
		System.out.println("");
		for (Repertoire rep : tab) {
			if (x < rep.getAge()) {
				x = rep.getAge();
			}
		}
		System.out.println(x);
	}
}
