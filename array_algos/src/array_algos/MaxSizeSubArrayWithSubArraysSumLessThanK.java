package array_algos;

public class MaxSizeSubArrayWithSubArraysSumLessThanK {

	final static int arr[] = {1, 2, 10, 4};
	final static int k = 14;
	
	public static void main(String[] args) {

		System.out.println(maxSizeSubArraySubArraySumLessThanK(arr, k));
	}

	private static char[] maxSizeSubArraySubArraySumLessThanK(final int[] arr, final int k) {
		
		final int arraylength = arr.length;
		//intitialize prefixSummSubArray with size of length + 1
		int[] prefixSum = new int[arraylength + 1];
		
		for (int i =0; i < prefixSum.length ; i++) {
			prefixSum[i] = 0;
		}
		
		
		return null;
	}

}
