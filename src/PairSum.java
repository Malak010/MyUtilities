
/**
 * Java Program to find all pairs of elements in Java array whose sum is equal
 * to a given number.
 *
 */
public class PairSum {

	public static void main(String[] args) {

		// if i+j = sum make these two index as one pair ==> [i,j] | [[2,3] [1,4]]
		int arr[] = { 2, 3, 1, 8, 4, 6 };
		int sum = 5;

		System.out.printf("[");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				// Statement for checking elements of array to find pair of sum '5'
				if ((arr[i] + arr[j]) > sum) {

				} else if ((arr[i] + arr[j]) < sum) {

				} else if ((arr[i] + arr[j]) == sum) {
					System.out.printf("[%d,%d]", arr[i], arr[j]);
					break;

				}

			}
		}
		System.out.printf("]");

	}
}// End of Class
