package oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class csvhandle {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Anshul Thakral\\csvfile.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while((s=b.readLine())!=null) {
			String[] str = s.split(",");
			for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	  }

	}

}
