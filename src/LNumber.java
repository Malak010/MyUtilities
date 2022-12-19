import java.util.Arrays;

/**
 * Java Program - Find Largest Number of an Array
 */
public class LNumber {
	public static void main(String[] args) {
		// an array
		int[] arr = { 50, 12, 50, 10, 1001, 6, 87, 24 };

		String num = Arrays.toString(arr); // Array in string format
		System.out.println("Array: " + num);

//        System.out.print("[");
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ," + " ");
//          }
//        System.out.print("]");

		int index = 0;// Starting from index 0 = 50 first element
		int largest = 0;
		int second = 0;
		int third = 0;

		while (index < arr.length) {
			// check if largest is smaller than element

			if (largest < arr[index]) {
				// update largest
				largest = arr[index];
			} else if (second < arr[index]) {

				second = arr[index];
			}

			index++;
		}

		System.out.println(" ");
		System.out.println("Largest number is : " + largest);
		System.out.println("Second Largest number is : " + second);
		System.out.println(" ");
		int[] output1 = new int[] { largest, second };
		System.out.println("First Largest & Second Largest: " + Arrays.toString(output1));

	}

}// End of Class