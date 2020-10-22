package initiation_tableaux;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] chiffreAffaire = { 1234, 563, 657, 453, 986, 678, 564, 234, 786, 123, 534, 975 };
		Arrays.sort(chiffreAffaire);
		System.out.println(Arrays.binarySearch(chiffreAffaire, 563));
		
		System.out.println(Arrays.toString(chiffreAffaire));
		
		
		int[] premierTrimestre;
		premierTrimestre=Arrays.copyOfRange(chiffreAffaire, 0, 3);
		System.out.println(Arrays.toString(premierTrimestre));
		
		
	}

}
