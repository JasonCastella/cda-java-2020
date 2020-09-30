package initiation;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class PierreFeuilleCiseaux {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		liste.add("Pierre");
		liste.add("Feuille");
		liste.add("Ciseaux");

		Random random = new Random();
		//TODO int�grer un do while et comptabilis� les points
		int scoreU, scoreC=0;
		System.out.println("Veuillez tapper Pierre, Feuille ou Ciseaux :");
		String user = Clavier.lireString();
		if ((user.equals("Pierre")) || (user.equals("Feuille")) || (user.equals("Ciseaux"))) {
			String computer = liste.get(random.nextInt(liste.size()));
			System.out.println("Mon signe est : " + computer + "\n" + user + " VS " + computer);
			if (user.equals(computer)) {
				System.out.println("M�me signe, essayez encore !");
			} else if (((computer.equals("Pierre")) && (user.equals("Ciseaux")))
					|| ((computer.equals("Ciseaux")) && (user.equals("Feuille"))
							|| ((computer.equals("Feuille")) && (user.equals("Pierre"))))) {
				System.out.println("Vous avez perdu !");
			} else
				System.out.println("Vous avez gagn� !");
		} else
			System.out.println("Vous n'avez pas tapp� Pierre, Feuille ou Ciseaux...");
	}

}
