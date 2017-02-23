package array_algos;

import java.util.Arrays;

public class MajorityElementInArray {

	
	private final static int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4, 4, 5, 1, 4, 4, 3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("majority element using naive sorting is: " + majorityElementNaiveSorting(arr));
		
		final MajorityElementInArray majorityElement = new MajorityElementInArray();
		System.out.println("Majority Element using Moore's algorithm is: " + majorityElement.mooresVotingAlgorithm(arr));

	}
	
	public static int majorityElementNaiveSorting(final int arr[]) {
		
		if (arr.length == 1) {
			return arr[0];
		}
		
		Arrays.sort(arr);
		
		int previous = arr[0];
		int count = 1;
		
		for (int i =1; i < arr.length; i++) {
			if (previous == arr[i]) {
				count++;
				if (count > arr.length/2) {
					return arr[i];
				}
			} else {
				count = 1;
				previous = arr[i];
			}
		}
		return -1;
	}
	
	public int mooresVotingAlgorithm(final int arr[]) {
		
		final int size = arr.length;
		/* Find the candidate for Majority*/
        int cand = findCandidate(arr, size);
 
        /* Print the candidate if it is Majority*/
        if (isMajority(arr, size, cand))
            return cand;
        else
            return -1;
	}
	
	/* Function to find the candidate for Majority */
    int findCandidate(int a[], int size) 
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
 
    /* Function to check if the candidate occurs more
       than n/2 times */
    boolean isMajority(int a[], int size, int cand) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    }

}
