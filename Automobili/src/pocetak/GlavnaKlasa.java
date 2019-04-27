package pocetak;

import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Metode m = new Metode();
		
	/*	System.out.println("Ubaci ime marke: ");
		String ime_marke = scanner.nextLine();
		
		System.out.println("Ubaci zemlju: ");
		String zemlja = scanner.nextLine();
		
		m.ubaciMarku(ime_marke, zemlja);*/
		
		//m.ubaciMarku("Opel", "Nemacka");
		
		
		Marke marke = m.vratiMarku(4);
		System.out.println(marke.getIme_marke()+"  "+marke.getZemlja());
		
		
		Marke x = new Marke();
		x.setIme_marke("Suzuki");
		System.out.println(x.getIme_marke());
		
		
		

	}

}
