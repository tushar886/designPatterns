package array_algos;

public class SecondSmallest {

	public static void main(String[] args) {

		int arr[] = {-3, 7, 8 , 0 , 2, -6, 9, 1};

		printSecondSmallestLinear(arr);
	}

	private static void printSecondSmallestLinear(int[] arr) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MIN_VALUE;

		if (arr.length < 2) {
			System.out.println("Invalid array size");
			return;
		}

		for (int i = 0 ; i < arr.length ; i++) {

			/*
			 * if current element is smaller than both smallest and secondSmallest update both the elements.
			 */
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				/*
				 * The element is smaller than second smallest assign it to secdon smallest
				 */
				secondSmallest = arr[i];
			}
		}
		if (secondSmallest == Integer.MAX_VALUE)
			System.out.println("There is no second smallest element");
		else
			System.out.println("Smallest: " + smallest + " secondSmallest: " + secondSmallest);
	}
}