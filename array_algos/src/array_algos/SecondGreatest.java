package array_algos;

public class SecondGreatest {

	public static void main(String[] args) {
		
		int arr[] = {-3, 7, 8 , 0 , 2, -6, 9, 1};
		printSecondGreatest(arr);
	}

	private static void printSecondGreatest(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		if (arr.length < 2) {
			System.out.println("Incorrect size of array");
			return;
		}
		
		for (int i =0; i < arr.length; i ++) {
			
			if (arr[i] > largest) {
				secondLargest  = largest;
				largest = arr[i];
			} else if ( arr[i] >secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest no found");
		} else {
			System.out.println("Largest: " + largest + " second largest: " + secondLargest);
		}
	}

}
