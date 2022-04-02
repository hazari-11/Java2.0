package patternQuestions;

import java.util.Scanner;

public class InvertedFullPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			for(int k=0 ; k<i-1 ; k++) {
				System.out.print(" ");
			}
			for(int j=2*n-i ; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
