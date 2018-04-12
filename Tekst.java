import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tekst {
	

	public String[][] wczytaj_pary() throws FileNotFoundException{
		
		String[][] Pary = new String[100][2];
		
		File file = new File("anagramy.txt");
		Scanner in = new Scanner(file);
		int count = 0;
		
		while(count != 100){
			
			String para = in.nextLine();
			String[] linijka = para.split(" ");
			Pary[count][0] = linijka[0];
			Pary[count][1] = linijka[1];
			count++;
			
		}
		
		return Pary;
	}
}
