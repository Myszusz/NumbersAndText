import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalizaTekstu extends Tekst {
	
	
	public void znajdz_anagramy() throws FileNotFoundException{
		
		List<String> anagramy = new ArrayList<String>();
		String[][] Pary = wczytaj_pary();
		int ilosc = 0;
		
		for(int i = 0; i <= Pary.length - 1; i++){
			
			if(isAnagram(Pary[i][0], Pary[i][1]) == true){
				
				String para = Pary[i][0] + " " + Pary[i][1];
				anagramy.add(para);
				ilosc++;
			}
		}
		
		System.out.println("Iloœæ anagramów w tekscie: " + ilosc);
		System.out.println("Anagramy w tekscie: ");
		for(String x : anagramy){
			System.out.println(x);
		}
	}
	
	public boolean isAnagram(String firstWord, String secondWord) {
	     char[] word1 = firstWord.replaceAll("[\\s+]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s+]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}
	
	public void duble() throws FileNotFoundException{
		
		List<String> duble = new ArrayList<String>();
		String[][] Pary = wczytaj_pary();
		int ilosc = 0;
		
		for(int i = 0; i <= Pary.length - 1;i++){
			
			if(Pary[i][0].equals(Pary[i][1])){
				
				String para = Pary[i][0] + " " + Pary[i][1];
				duble.add(para);
				ilosc++;
				
			}
		}
		
		System.out.println("Iloœæ identycznych par tekstów: " + ilosc);
		System.out.println("Pary tekstów które s¹ identyczne: ");
		
		for(String x : duble){
			System.out.println(x);
		}
	}
}
