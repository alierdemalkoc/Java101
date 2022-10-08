import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Hello {
	static String isim;
	static String yazi;
	
	public static void main(String[] args) {
		//replace();
		//count();
		//arrayFlip();
		//arrayFlip2();
		arrayChallenge();
	}
	
	private static void arrayChallenge() {
		System.out.println("Metin giriniz:");
		Scanner scn = new Scanner(System.in);
		yazi = scn.nextLine();
		Set<Character> chars = new LinkedHashSet<>();
		for (int i = 0; i < yazi.length(); i++) {
			if(yazi.charAt(i) != ' ') {
			chars.add(yazi.charAt(i));
			}
		}
		System.out.println(chars.toString());
		
		StringBuilder sb = new StringBuilder(chars.size());
        for (Character ch: chars) {
        	if(ch != ' ') {
            sb.append(ch);
        	}
        }
        System.out.println(sb.toString());
		
		ArrayList<Character> liste = new ArrayList<>();
		for (int i = 0; i < yazi.length(); i++) {
			if (yazi.charAt(i) != ' ') {
				liste.add(yazi.charAt(i));
			}
		}
		Set<Character> yeniListe = new LinkedHashSet<Character>(liste);
		for (Character ch : yeniListe) {
			System.out.print(ch.toString() + Collections.frequency(liste, ch));
		}
        }
		/*
        StringBuilder sb = new StringBuilder(chars.size());
        for (Character ch: chars) {
        	if(ch != ' ') {
            sb.append(ch);
        	}
        }
		String string = sb.toString();
		System.out.println(string);
		
		ArrayList<Character> liste = new ArrayList<>();
		
		StringBuilder sb2 = new StringBuilder();
		
		
		Set<Character> liste = new HashSet<>();
		for (int i = 0; i < chars.size(); i++) {
			liste.add((char) chars.indexOf(i));
		}
		System.out.print(liste.toString());*/
	

	private static void arrayFlip2() {
		int[] sayilar = new int[]
				{ 1, 2, 3 };
				int[] sayilar2 =
				{ 4, 5, 6 };
				int[] sayilar3 =
				{ 7, 8, 9 };
				int[][] matris = new int[][]
				{ sayilar, sayilar2, sayilar3 };
				int[][] newMatris = new int[matris[0].length][matris.length];
				
				for (int i = 0; i < matris.length; i++) {
					for (int j = 0; j < matris[0].length; j++) {
						
						newMatris[j][i] = matris[i][j];
					}
				}

				for (int i = 0; i < newMatris.length; i++)
				{
					int[] satir = newMatris[i];
					for (int j = satir.length - 1; j >= 0 ; j--)
					{
						System.err.print(satir[j] + " ");
					}
					System.err.println();
				}
	}

	private static void arrayFlip() {
		int[] sayilar = new int[]
				{ 1, 2, 3 };
				int[] sayilar2 =
				{ 4, 5, 6 };
				int[] sayilar3 =
				{ 7, 8, 9 };
				int[][] matris = new int[][]
				{ sayilar, sayilar2, sayilar3 };

				for (int i = matris.length - 1; i >= 0 ; i--)
				{
					int[] satir = matris[i];
					for (int j = satir.length - 1; j >= 0; j--)
					{
						System.err.print(satir[j] + " ");
					}
					System.err.println();
				}
	}

	private static void count() {
		System.out.println("Metin giriniz:");
		Scanner scn = new Scanner(System.in);
		yazi = scn.nextLine();
		for (int i = 0; i < yazi.length(); i++) {
			int count = 1;
			while(i<yazi.length()-1 && yazi.charAt(i)==yazi.charAt(i+1) && yazi.charAt(i) != ' ') {
				count++;
				i++;
			}if(yazi.charAt(i) != ' ') {
			System.out.print(yazi.charAt(i) + "" + count);} else {
				System.out.print(" ");
			}
		}		
			
	}

	private static void replace() {
		
		System.out.println("İsim giriniz:");
		Scanner scn = new Scanner(System.in);
		isim = scn.nextLine();
		String yeniisim = isim
				.replace("a", "1")
				.replace("e", "2")
				.replace("ı", "3")
				.replace("i", "4")
				.replace("o", "5")
				.replace("ö", "6")
				.replace("u", "7")
				.replace("ü", "8");
		System.out.println(yeniisim);
	
						
		
	}

}
