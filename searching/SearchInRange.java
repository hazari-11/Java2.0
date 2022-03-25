package searching;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {18, 12, -7, 3, 14, 28};
		int target = 3;
		System.out.println(linearSearch(arr, target, 1, 4));
	}
	
	static int linearSearch(int[] arr, int target, int start, int end) {
		int ans=-1;
		for(int index=start ; index<=end ; index++) {
			if(arr[index]==target) {
				ans = index;
			}
		}
		return ans;
	}
}
