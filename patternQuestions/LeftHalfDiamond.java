package patternQuestions;

import java.util.Scanner;

public class LeftHalfDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=2*n-1 ; i++) {
			if(i<=n) {
				for(int sp=1 ; sp<=n-i ; sp++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int sp=1 ; sp<=i-n ; sp++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<=2*n-i ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
