package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
		int target = 22;
		System.out.println(binarySearch(arr, target));
	}
	
	// return the index
	// return -1 if the element does not exist
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1; 
		while(start<=end) {
			// find the middle element
			// int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of int in Java 
			// (start+end)/2 and start+(end-start)/2 => Both are same but second one avoids error that's why we used it
			int mid = start + (end-start)/2;
			if(target<arr[mid]) {
				end = mid-1;
			}
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				// answer found
				return mid;
			}
		}
		return -1;
	}
}
