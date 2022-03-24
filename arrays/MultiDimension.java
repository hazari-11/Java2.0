package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//	int[][] arr = new int[3][]; // no of rows is mandatory to specify
		
//		int[][] arr = {
//				{1, 2, 3}, // 0th index
//				{4, 5},  // 1st index
//				{6, 7, 8, 9}  // 2nd index
//		};
		
		int[][] arr = new int[3][4];
		System.out.println(arr.length); // 3
		
		// Input
		
		for(int row=0 ; row<arr.length ; row++) {
			// for each column in every row
			for(int col=0 ; col<arr[row].length ; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		
//		// Output
//		
//				for(int row=0 ; row<arr.length ; row++) {
//					// for each column in every row
//					for(int col=0 ; col<arr[row].length ; col++) {
//						System.out.print(arr[row][col] + " ");
//					}
//					System.out.println();
//				}
		
		// Output
		
//		for(int row=0 ; row<arr.length ; row++) {
//			System.out.println(Arrays.toString(arr[row]));
//		}
		
		// Output
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}

}
