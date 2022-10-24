package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import myReader.MyReader;

public class MainClass {
	
	public static void main(String[] args) {
		//readingWords();
		readingAtLine();
	}

	private static void readingAtLine() {
		System.out.println("Dosya kaynağı giriniz:");
		Scanner scn = new Scanner(System.in);
		String kaynak = scn.nextLine();
		File myFile = new File(kaynak);
		System.out.println("Satır numarası:");
		int satirNo = scn.nextInt();

		try {
			MyReader myReader = new MyReader(new FileReader(myFile));
			String line;
			for (int i = 1; i < satirNo; i++)
				try {
					myReader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          try {
				line = myReader.readLine();
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void readingWords() {
		System.out.println("Dosya kaynağı giriniz:");
		Scanner scn = new Scanner(System.in);
		String kaynak = scn.nextLine();
		File myFile = new File(kaynak);
		
		MyReader myReader;
		try {
			myReader = new MyReader(new FileReader(myFile));
			myReader.readWords(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*File file = new File("C:\\Users\\monster\\Desktop\\Kitap\\ilk.txt");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
			//	String[] kelimeler = new String[]
				System.out.println(scan.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}

}
