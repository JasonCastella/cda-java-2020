package tp8TableauxObjet;

public class Dragon {

	private int index;
	private String nom;
	private char sexe;
	private int longueur;
	private int nbEcaille;
	private boolean crache;
	private String comportement;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getNbEcaille() {
		return nbEcaille;
	}

	public void setNbEcaille(int nbEcaille) {
		this.nbEcaille = nbEcaille;
	}

	public boolean isCrache() {
		return crache;
	}

	public void setCrache(boolean crache) {
		this.crache = crache;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
