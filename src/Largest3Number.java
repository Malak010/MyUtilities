import java.util.Arrays;

/**
 * 
 */

/**
 * @author LAP-3
 *Java Program To return Largest number from array
 */
public class Largest3Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,12,8,10,1001,6,87,24};
		String num = Arrays.toString(arr);  //Array in string format
        System.out.println("Array: " + num);
        System.out.println(" ");
        
        int[] max = getMax(arr);
       // int max = getMax(arr);
        System.out.println("Largest Number of array is: "+Arrays.toString(max));

	}
	 public static int[] getMax(int[] arr){ 
		 
			int index = 0;// Starting from index 0 = 50 first element
			int largest1 = arr[0];
			int largest2 = arr[0];
			int largest3 = arr[0];

			while (index < arr.length) {
				if (largest1 < arr[index]) {
					// update largest
					largest1 = arr[index];
				} else if (largest2 < arr[index]) {

					largest2 = arr[index];
				}
				else if (largest3 < arr[index]) {

					largest3 = arr[index];
				}

				index++;
			}
			int[] largests = new int []{largest1,largest2,largest3};
			return largests;
	 }
	 
}//end of class
