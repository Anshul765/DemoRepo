package oops;

import java.util.Arrays;

public class String_concepts {

	public static void main(String[] args) {
	String s1 = "Anshul";
	String s2 = "Anshul";
	
	int arr[] = {4,20,87,69,22,35};
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			System.out.println("a[i] will be: "+arr[i]); 
			System.out.println("a[j] will be: "+arr[j]); 
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				System.out.println("array will be" + j + Arrays.toString(arr));
				
			}
		}
	}
	System.out.println("2nd larget element is: " +arr[arr.length-2]);
	
	if(s1==s2) {
		System.out.println("in SCP Address are same");
	}
	else {
		System.out.println("Address are not same");
	}
		
	
	String s11 = new String("Anshul");
	String s21 = new String("Anshul");
	
	if(s11==s21) { 
		System.out.println("Address are same");
	}
	else {
		System.out.println("In Heap Address are not same");
	}
	
	
	String str = "Anshul";
	str.concat("thakral");
	System.out.println("String is: "+str); //here  concatenate will not happen as String is immutable class so can't be modified.
	
	String str1 = "My name is Anshul";
	String[] str2 = str1.split(" "); //String[] because return type of split is array of String
	
	int len2 = str2.length;
	int len = str1.length();
	
	System.out.println(len);
	
	for(int i=0;i<len;i++) {
		System.out.println(str1.charAt(i));
	}
	
	System.out.println("testing");
	for(int i=0;i<len2;i++) {
		
	
		System.out.print(str2[i]+" ");
	}

	
	int count=0;
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i) == 'n') {
			count++;
		}
		
	}
	System.out.println("count is:"+count);
	
	String str5[] = str1.split(" ");
	
	for(int i=str5.length-1;i>=0;i--) {
		System.out.print(str5[i]+" ");
	}

	
	
	String str7 ="";
	for(int i=str2.length-1;i>=0;i--) {
		str7 = str7 + str2[i] + " ";
	}
		System.out.println("Another way of reverse is:" +str7);
		
		

		
	String str10 = "1010101010";
	String str11="";
	String str12="";
	
	for(int i=0;i<str10.length();i++) {
		if(str10.charAt(i)=='1') {
			str11=str11+str10.charAt(i);
		}
		else {
			str12=str12+str10.charAt(i);
		}
	}
	String str13= str11.concat(str12);
	System.out.println(str13);
	
	String str20 = "My Name is Anshul";
	String str21[] = str20.split(" ");
	String str22 = "";
	
	for(int i=0;i<str21.length;i++) {
		str22=str22+str21[i];
		if(i != str21.length-1) {
			str22=str22.concat("$");	
		}
	  }
	
	String str51 = "MyNameIsAnshul";
	StringBuilder result = new StringBuilder();
	for(int i=0;i<str51.length();i++) {
		char c = str51.charAt(i);
		System.out.print(c);
		if(i!=0 && Character.isUpperCase(c)) {
			result.append(' ');
		}
		result.append(c);
	}
	
	System.out.println("result is: "+result);

	
	
	
	}
 }
