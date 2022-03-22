package JavaByHazari;

import java.util.*;

public class CountingOccurences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		int count = 0, rem=0;
		while(num>0) {
			rem = num%10;
			if(rem==n)
				count++;
			num/=10;
		}
		System.out.println(count);
	}

}
