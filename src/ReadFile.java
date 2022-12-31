import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
 * Java Program to read the content of this file and store it in a HashMap<String, String[]>
Print every key-value pair of the HashMap on console
 */

public class ReadFile {
	// Declare path of the file
	public static final String DATA_FILE_PATH = "data/data.csv";

	public static void main(String[] args) {

		// use File class to read data from the file data.csv
		File file = new File(ReadFile.DATA_FILE_PATH);

		// Create a HashMap to store
		HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
		try {

			Scanner scanFile = new Scanner(file);

			while (scanFile.hasNextLine()) {// Scan All Line in a file
				String s = scanFile.nextLine();
				System.out.println(s);// Print all lines
				String[] sd = s.split(",");
				hashMap.put(sd[0], sd);

				System.out.println(Arrays.toString(hashMap.get(sd[0])));
				System.out.println("====================================");
			}

			scanFile.close();// Should close external resource to avoid memory leak
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}// End of Class
