package initiation_tableaux;

public class Compteur {

	public static void main(String[] args) {

		int[] tab = {3,10,8,-2,3,1,-4};
		countNeg(tab);
		sommeInpair(tab);
		produitPair(tab);
	}

	public static int countNeg(int[]tab) {
		int count=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]<0) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
	public static int sommeInpair(int[]tab) {
		int sum=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]%2==1) {
				sum += tab[i];
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int produitPair(int[]tab) {
		int produit=1;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]%2==0) {
				produit*=tab[i];
			}
		}
		System.out.println(produit);
		return produit;
	}
}
