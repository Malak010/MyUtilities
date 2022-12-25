import java.util.HashMap;

/**
 * Java Program to find all pairs of elements in Java array whose sum is equal
 * to a given number | Using HashMap
 *
 */
public class PairSumHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 6, 7, 4, 3, 4, 5, 6 };
		int sum = 10;

		PairSumHM pair = new PairSumHM();// create an object
		pair.findPairs(num, sum);// store result in object pair

	}

	public static void findPairs(int[] num, int sum) {

		// HashMap to find all the pairs that add up to give a number sum
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

		System.out.print("[");

		for (int i : num) {// for each loop
			if (hMap.containsKey(sum - i)) {
				System.out.printf("[%d,%d]", (sum - i), i);
				hMap.remove(sum - i);// To avoid duplication
			}

			hMap.put(i, sum);

		}
		System.out.print("]");

	}
}// End of Class
