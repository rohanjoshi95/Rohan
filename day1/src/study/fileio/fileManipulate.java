package study.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileManipulate {

	public static void main(String[] args) throws IOException {

	      @SuppressWarnings("resource")
		FileReader fr=new FileReader("C:\\Users\\trainee\\Rohan\\day1\\src\\study\\reversestring\\rohan.txt");
		  int a;
		  while((a=fr.read())!=-1)
		  {
			  System.out.print((char)a);
		  }
		  
		  System.out.println("\n");
		  System.out.println("After changing the data");
		  
		  
		  try{
		    	String content = "I am going to home";
		        //Specify the file name and path here
		    	File file =new File("C:\\Users\\trainee\\Rohan\\day1\\src\\study\\reversestring\\rohan.txt");

		    	/* This logic is to create the file if the
		    	 * file is not already present
		    	 */
		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}

		    	//Here true is to append the content to file
		    	FileWriter fw = new FileWriter(file,true);
		    	//BufferedWriter writer give better performance
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(content);
		    	//Closing BufferedWriter Stream
		    	bw.close();

			System.out.println("Data appended file");

		      }catch(IOException ioe){
		         
		    	 ioe.printStackTrace();
		       }
		  System.out.println("\n");
		  
		  File f=new File("rohan.txt");
	      String str1=f.getAbsolutePath();
	      System.out.println("\n"+str1);
		  
		}
	}

