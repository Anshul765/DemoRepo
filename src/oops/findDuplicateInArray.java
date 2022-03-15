package oops;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateInArray {

	public static void main(String[] args) {
		String arr[] = {"A","B","A","C","S","C","S","Z"};
		Set<String> st = new HashSet<String>();
		for(String element:arr) {
			if(st.add(element) == false) {
				System.out.println(element);
			}
			
		}
		
 
	}

}
