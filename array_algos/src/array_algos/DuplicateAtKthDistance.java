package array_algos;

public class DuplicateAtKthDistance {

	public static void main(String[] args) {
		
		 int k =3;
		 int arr[] = {10, 5, 3, 4, 3, 5, 6};
	     findDuplicatesWithinK(arr, 3);
	}

	private static void findDuplicatesWithinK(final int[] arr, final int k) {
		
		int arrayLength = arr.length;
		for (int i =0; i < arrayLength; i++) {
			
			int index = (i + k) > arrayLength ? ((i + k) - arrayLength) : i + k;
			System.out.println("i: " + i + " index: " + index);
			if (arr[i] == arr[index])
				System.out.println("Duplicate element with distance: " + k + " found as: " + arr[i]);
		}
		
	}
private static void findDuplicatesAtK(final int[] arr, final int k) {
		
		int arrayLength = arr.length;
		for (int i =0; i < arrayLength; i++) {
			
			int index = (i + k) > arrayLength ? ((i + k) - arrayLength) : i + k;
			System.out.println("i: " + i + " index: " + index);
			if (arr[i] == arr[index])
				System.out.println("Duplicate element with distance: " + k + " found as: " + arr[i]);
		}
}
