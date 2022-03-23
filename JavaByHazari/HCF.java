package JavaByHazari;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans =0;
		for(int i=Math.min(a, b) ; i>=2 ; i--) {
			if(a%i==0 && b%i==0) {
				ans = i;
				break;
			}
			else { ans = 1;}
		}
		System.out.println(ans);
	}

}
