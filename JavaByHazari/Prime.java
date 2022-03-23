package JavaByHazari;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}
	
	static boolean isPrime(int num) {
		boolean ans = true;
		if(num<=1) {
			ans = false;
		}
		for(int i=2 ; i*i<=num ; i++) {
			if(num%i==0 && num!=i) {
				ans = false;
			    break;
			}
		}
		return ans;
	}

}
