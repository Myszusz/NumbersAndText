import java.util.ArrayList;
import java.util.List;

public class LiczbyPierwsze extends Liczby{
	
	public void znajdz_pierwsze(){
		
		List<Integer> liczbyPierwsze = new ArrayList<Integer>();
		int j;
		int ilosc = 0;
		
		for(int i = DolnyZakres; i <= GornyZakres; i++){
			if(i == 2 || i == 3){
				liczbyPierwsze.add(i);
				ilosc++;
			}
			else if(i < 2){
				continue;
			}
			else{
				for(j = i-1; j >= 3; j--){
					if(i%j == 0){ 
						break;
					}
				}
				if(i%j == 0){
					continue;
				}
				else{
					if(i%j != 0){
						liczbyPierwsze.add(i);
						ilosc++;
					}
				}	
			}
			
		}
		System.out.println("Iloœæ liczb pierwszysch w zakresie to: " + ilosc);
		System.out.println("Liczby pierwsze w zakresie to: ");
		for(int x : liczbyPierwsze){
			System.out.print(x + " | ");
		}
			
	}
	
	
	public List<Integer> znajdz_palindromy(){
		
		List<Integer> Palindromy = new ArrayList<Integer>();
		int ilosc = 0;
		
		for(int i = DolnyZakres; i <= GornyZakres; i++){
			
			String liczba = Integer.toString(i);
			char[] znaki = liczba.toCharArray();
			int poczatek = 0;
			int koniec = liczba.length() - 1;
			
			
			while(poczatek > koniec){
				if(znaki[poczatek] != znaki[koniec]){
					break;
				}
				poczatek++;
				koniec--;
			}
			if(znaki[poczatek] != znaki[koniec]){
				continue;
			}
			else{
				Palindromy.add(i);
				ilosc++;
			}
		}
		
		System.out.println("Iloœæ palindromów w zakresie to: " + ilosc);
		System.out.println("Palindromy w zakresie to: ");
		for(int x : Palindromy){
			System.out.print(x + " | ");
		}
		
		return Palindromy;
	}
	
	
	public void znajdz_pierwsze_palindromy(){
		
		List<Integer> Palindromy = new ArrayList<Integer>();
		List<Integer> PierwszePalindromy = new ArrayList<Integer>();
		int ilosc = 0;
		
		for(int i = DolnyZakres; i <= GornyZakres; i++){
			
			String liczba = Integer.toString(i);
			char[] znaki = liczba.toCharArray();
			int poczatek = 0;
			int koniec = liczba.length() - 1;
			
			while(poczatek > koniec){
				if(znaki[poczatek] != znaki[koniec]){
					break;
				}
				poczatek++;
				koniec--;
			}
			if(znaki[poczatek] != znaki[koniec]){
				continue;
			}
			else{
				Palindromy.add(i);
			}
		}
		
		int j;
		for(int x : Palindromy){
			if(x == 2 || x == 3){
				PierwszePalindromy.add(x);
				ilosc++;
			}
			else if(x < 2){
				continue;
			}
			else{
				for(j = x-1; j >= 3; j--){
					if(x%j == 0){ 
						break;
					}
				}
				if(x%j == 0){
					continue;
				}
				else{
					if(x%j != 0){
						PierwszePalindromy.add(x);
						ilosc++;
					}
				}	
			}
		}
		
		System.out.println("Iloœæ liczb pierwszych które s¹ palindromami w zakresie to: " + ilosc);
		System.out.println("Liczby pierwsze które s¹ palindromami w zakresie to: ");
		
		for(int y : PierwszePalindromy){
			System.out.print(y + " | ");
		}
		
	}
}
