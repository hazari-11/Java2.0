package JavaByHazari;

import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 45, 6};
		change(arr);  // call by value
		System.out.println(Arrays.toString(arr));
	}
	static void change(int[] nums) {
		nums[0]=99; // if you make a change to this object via this reference varible, same object will be changed
	}
}
