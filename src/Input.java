import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.Scanner;

/*
 *Java Program to Read the strings from the file input.txt
 *Convert all string words to uppercase and save the result in file output.txt
 */
public class Input {

	public static final String DATA_FILE_PATH = "data/input.txt";
	public static final String DATA_FILE_PATH1 = "data/output.txt";
	
	public static void main(String[] args) {

		File file = new File(Input.DATA_FILE_PATH);
	    File file2 = new File(Input.DATA_FILE_PATH1);
				try {
				FileWriter newFileWriter = new FileWriter(Input.DATA_FILE_PATH);
				FileWriter newFileWriter2 = new FileWriter(Input.DATA_FILE_PATH1);
				System.out.println("I have created this file for you: " + Input.DATA_FILE_PATH);
				System.out.println("I have created this file for you: " + Input.DATA_FILE_PATH1);
				
				String str = "I am a sentence\r\n"
						+ "I am available in this file\r\n"
						+ "This file is the only place I can survive in\r\n"
						+ "You are free to process me\r\n"
						+ "Convert each of my line to uppercase\r\n"
						+ "Don't modify me please, just put the result in a different file\r\n"
						+ "call it the output.txt file\r\n";
			
				//store a string in a file.
				 newFileWriter.write(str);
				 	String str2 = str.toUpperCase();
				 	
				 	newFileWriter2.write(str2);
				 
				 
				 newFileWriter.close();
				 newFileWriter2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			
		
			
	
	}
	
}//End of Class
