package oops;

import java.util.HashMap;
import java.util.Map;

public class countChar {
	public static void main(String arg[]) {
		String str = "i love coding";
		
		
		//countChar.getcharacter(str, 'i');
		//getcharacterusingfor(str, 'o');
		//getcharacterv2(str);
		charcountusingmap(str);
		
		
	
	}
	
	public static void  getcharacterusingfor(String str, char val) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == 'i') {
				count++;
			}
		}
			
	System.out.println("count of " +val+ "  is: "+count);
		
	}
	
	public static void  getcharacter(String str, char val) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == val) {
				count++;
			}
		}
			
	System.out.println("count of " +val+ "  is: "+count);
		
	}
	
	
	public static void getcharacterv2(String str) {
		
		char ch1; 
		for(int i=0;i<str.length();i++) {
			ch1 = str.charAt(i);
			getcharacter(str,ch1);
			}
		}
	

	public static void charcountusingmap(String str) {
	char check[] = str.toCharArray();
	Map<Character,Integer> mymap = new HashMap<Character,Integer>();
	
	for(char ch: check) {
		if(!String.valueOf(ch).isBlank()) {
		if(mymap.containsKey(ch)) {
			mymap.put(ch, mymap.get(ch)+1);
		}
		else {
			mymap.put(ch,1);
		}
	}
	}
	System.out.println(str + " : " + mymap);
	
	}
}	