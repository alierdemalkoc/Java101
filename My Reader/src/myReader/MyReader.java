package myReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class MyReader extends BufferedReader {
	public MyReader(Reader in) {
		super(in);
	}


public void readWords(File file) {
	ArrayList<String> kelimeler = new ArrayList<>();
	try {
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			kelimeler.add(scan.next());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String[] kelimeDizisi = kelimeler.toArray(new String[kelimeler.size()]);	
	//System.out.println(kelimeler);
	for (String str : kelimeDizisi) {
        System.out.println(str);
    }
}

public void readLineAt(int satir) {
	  /* try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
	          for (int i = 0; i < n; i++)
	              br.readLine();
	          line = br.readLine();
	          System.out.println(line);
	      }
	      catch(IOException e){
	        System.out.println(e);
	      }*/
}
}

