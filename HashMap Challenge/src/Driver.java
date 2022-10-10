import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		hashMapCount();
	}

	private static void hashMapCount() {
		System.out.println("Yazı giriniz:");
		Scanner scn = new Scanner(System.in);
		String yazi = scn.nextLine();
		scn.close();
		
		LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		 
	    char[] strArray = yazi.toCharArray();
		 
		        for (char c : strArray) {
		        	if (c != ' ') {
		            if (charCountMap.containsKey(c)) {
		                charCountMap.put(c, charCountMap.get(c) + 1);
		            }
		            else {
		                charCountMap.put(c, 1);
		            }
		        }
		        }
		 		        for (Map.Entry entry : charCountMap.entrySet()) {
		            System.out.print(entry.getKey().toString() + entry.getValue());
		        }
		    
	}

}
