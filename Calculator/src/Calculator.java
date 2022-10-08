import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		calculate();
	}

	private static void calculate() {
		System.out.println("1. sayı:");
		Scanner scn = new Scanner(System.in);
		int ilkSayi = scn.nextInt();
		
		System.out.println("İşlem");
		char islem = scn.next().charAt(0);
		
		System.out.println("2. sayı:");
		int ikinciSayi = scn.nextInt();
		
		if (islem == '+') {
			System.out.println("Toplama işleminin sonucu = " + (ilkSayi + ikinciSayi));
		}
		else if (islem == '-') {
			System.out.println("Çıkarma işleminin sonucu = " + (ilkSayi - ikinciSayi));
		}
		else if (islem == '*') {
			System.out.println("Çarpma işleminin sonucu = " + (ilkSayi * ikinciSayi));
		}
		else if (islem == '/') {
			System.out.println("Bölme işleminin sonucu = " + ((float)ilkSayi / ikinciSayi));
		}
		else {
			System.out.println("Eksik veya hatalı giriş yaptınız!");
		}
	}

}
