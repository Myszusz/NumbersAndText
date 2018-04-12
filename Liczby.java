import java.util.Scanner;


public class Liczby{
	Scanner in = new Scanner(System.in);
	
	int DolnyZakres = -1;
	int GornyZakres = -1;
	
	public void wczytaj_zakres(){
		System.out.println("Podaj dolny zakres liczb: ");
		DolnyZakres = in.nextInt();
		System.out.println("Podaj górny zakres liczb: ");
		GornyZakres = in.nextInt();
	}
	
	public void zmien_dolny_zakres(int LB){
		
		DolnyZakres = LB;
		
	}
	
	public void zmien_gorny_zakres(int UB){
		
		GornyZakres = UB;
		
	}
}
