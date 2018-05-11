package study.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileManipulate {

	public static void main(String[] args) throws IOException {

		
		  File file = new File("D:\\test.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		
		  }
	}

