package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {23, 45, 1, 2, 8, 19, -3, 6, -11, 28};
		int target = -3;
		
		System.out.println(linearSearch(nums, target));
	}
	
	// search in the array: return the index if item found
	// otherwise if item not found return -1
	static int linearSearch(int[] arr, int target) {
		int ans=-1;
		for(int index=0 ; index<arr.length ; index++) {
			if(arr[index]==target) {
				ans = index;
			}
		}
		return ans;
	}

}
