import java.io.FileNotFoundException;

public class main {
	public static void main(String[] args) throws FileNotFoundException{
		
		
		LiczbyPierwsze liczba = new LiczbyPierwsze();
		
		System.out.println("Zadanie 1/2 wcztany zakres: ");
		System.out.println("Nie dawaæ za du¿ych liczb, bo program mo¿e potrzebowaæ duzo czasu!!!");
		System.out.println("");
		
		liczba.wczytaj_zakres();	
		
		liczba.znajdz_pierwsze();
		System.out.println("");
		System.out.println("");
		liczba.znajdz_palindromy();
		System.out.println("");
		System.out.println("");
		liczba.znajdz_pierwsze_palindromy();
		
		System.out.println("");
		System.out.println("");
		System.out.println("Zadanie 1/2 zakres ustawiony na 1-131: ");
		System.out.println("");
		
		liczba.zmien_dolny_zakres(1);
		liczba.zmien_gorny_zakres(131);

		liczba.znajdz_pierwsze();
		System.out.println("");
		System.out.println("");
		liczba.znajdz_palindromy();
		System.out.println("");
		System.out.println("");
		liczba.znajdz_pierwsze_palindromy();
		
		
		
		AnalizaTekstu tekst = new AnalizaTekstu();
		System.out.println("");
		System.out.println("");
		System.out.println("Zadanie 3/4");
		System.out.println("");
		
		tekst.znajdz_anagramy();
		System.out.println("");
		tekst.duble();
	}
}
