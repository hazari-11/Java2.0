package searching;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		//int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
		int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
		int target = 22;
		System.out.println(orderAgnosticBS(arr, target));
	}

	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		// find whether the array is sorted in ascending or descending
		
//		boolean isAsc;
//		if(arr[start]<arr[end]) {
//			isAsc = true;
//		}
//		else {
//			isAsc = false;
//		}
		
		boolean isAsc = arr[start]<arr[end];

		
		while(start<=end) {
			
			// find the middle element
			// int mid = (start+end)/2; // might be possible that (start+end) exceeds the range of int in Java 
			// (start+end)/2 and start+(end-start)/2 => Both are same but second one avoids error that's why we used it
			
			int mid = start + (end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(isAsc) {
				if(target<arr[mid]) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}			
		}
		return -1;
	}
}
