import java.util.Arrays;
/*
 *Java Program to finding unique alphabets using an array
 */
public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize array 
		char [] al = {'c', 'a', 'c', 't', 'r', 'a', 'z'};

//Display array 
		System.out .println ("Alphabets: " + Arrays.toString(al));
		
Alphabets.findUnique(al);

		}
	
	public static void findUnique(char[] al) {
		System.out.print("Unique Alphabets: [");
		for (int i =0; i<al.length; i++) {
			boolean isUnique = false;
			
			for (int j =0; j<i; j++) {
				
				if (al[i] == al[j]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique){
				System.out.print(al[i] + ", ");
				
			}
			
		}System.out.print("]");
		
	}
}//End of Class
