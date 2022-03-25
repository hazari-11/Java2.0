package searching;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
	
	static int findNumbers(int[] nums) {
		int count = 0;
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	// function to check whether a number contains even digits or not
    static boolean even(int num) {
		int numOfDigits = digits(num);
		return numOfDigits%2==0 ;
	}
    
    // Count no of digits in a number
    static int digits(int num) {
    	int count = 0;
    	
    	while(num>0) {
    		count++;
    		num/=10;
    	}
    	
    	return count;
    }
}
