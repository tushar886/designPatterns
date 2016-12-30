package array_algos;

public class BitonicPoint {

	private final static int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
	
	public static void main(String[] args) {
		
		System.out.println("Bitonic Point using linear algorithm is as: " + findBitonicPointLinear(arr));
		
		System.out.println("Bitonic Point using logarithmic algorithm is as: " + findBitonicPointLogarthmic(arr));

	}

	private static int findBitonicPointLinear(int[] arr) {
		
		for (int i = 1 ; i < arr.length - 1; i ++) {
			if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	private static int findBitonicPointLogarthmic(int[] arr) {

		return bitonicPointBinarySearch(arr, 0, arr.length);
	}

	private static int bitonicPointBinarySearch(final int[] arr, final int start, final int end) {
		
		final int mid = (start + end)/2;
		
		if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]) 
			return arr[mid];
		else if (arr [mid] < arr[mid + 1])
			return bitonicPointBinarySearch(arr, mid + 1, end);
		else 
			return bitonicPointBinarySearch(arr, start, mid - 1);
	}

}
