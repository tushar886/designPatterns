package array_algos;

public class ReverseArray {

	private final static int arr[] = {1,2,3,4,5,6,7};
	
	//k is counter variable array needs to be reversed off.
    private static int k = 3;
	
	public static void main(String[] args) {
    
		for (int i =0; i< arr.length; i+=k) {
			int left = i;
			int right = Math.min(i + k - 1, arr.length-1);
		}
		
	}

}
