package JavaByHazari;

import java.util.Scanner;

public class ProductMinusSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int product=1, sum=0;
		while(n>0) {
			int rem = n%10;
			product*=rem;
			sum+=rem;
			n/=10;
		}
		System.out.println(product-sum);
	}

}
