import java.io.File;
import java.io.FileWriter; 
import java.util.Scanner;
/*
 * Java Program take input from user [name,Email] and store it in data.csv file
 */

public class InsertToFile {

	// Declare path of the file
	public static final String DATA_FILE_PATH = "data/data1.csv";

	public static void main(String[] args) {
		File file = new File(InsertToFile.DATA_FILE_PATH);

		try {
			// use FileWriter class to write data in the file
			FileWriter newFileWriter = new FileWriter(InsertToFile.DATA_FILE_PATH);
			
			// First column in Excel file (data1.csv)
			newFileWriter.write("ID" + "," + "Name" + "," + "Email" + "," + "Status" + "\n");
			Scanner sc = new Scanner(System.in);
			
			for (int i = 1; i < 3; i++) {
				Object id = String.format("%03d", i);
				System.out.println("Enter Your Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Your Email: ");
				String email = sc.nextLine();

				// store a string in a file
				newFileWriter.write(id + "," + name + "," + email + "," + "True" + "\n");
				System.out.println(id + "," + name + "," + email + "," + "True\n");
			}

			sc.close();
			newFileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}//End of Class
