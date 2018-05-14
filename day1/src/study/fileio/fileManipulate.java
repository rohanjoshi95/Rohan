package study.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileManipulate {

	public static void main(String[] args) throws IOException {

	FileReader fr=new FileReader("C:\\Users\\trainee\\Rohan\\day1\\src\\study\\reversestring\\rohan.txt");
		int a;
		  while((a=fr.read())!=-1)
		  {
			  System.out.print((char)a);
		  }
		
		  System.out.println("\n");
			 
		  System.out.println("After changing the data");
		  fr.close();
		  
		  int b;
		  FileReader fr2=new FileReader("C:\\Users\\trainee\\Rohan\\day1\\src\\study\\reversestring\\rohan.txt"); 
		  while((b=fr2.read())!=-1)    
	        {
	        	if((char)b==' ')
	        	{
	        		
	        		System.out.print( (char)b+" Will ");
	        	}
	        	
	        System.out.print((char)b);
	        }
	        fr2.close();
		  
	        File f=new File("rohan.txt");
	        String str=f.getAbsolutePath();
	        System.out.println("\n"+str);
		  }
	}

