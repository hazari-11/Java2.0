package JavaByHazari;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int n=sc.nextInt();
		int p = n;
		int digits = 0;
		long rem=0;
		double sum=0;
		
		while(p>0) {
			p/=10;
			digits++;
		}
		p=n;
		while(p>0) {
			rem = p%10; 
			sum+=Math.pow(rem, digits);
			p/=10;
		}
		if(sum==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a armstrong");
		}
	}

}
