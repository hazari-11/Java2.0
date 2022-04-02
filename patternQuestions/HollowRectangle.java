package patternQuestions;

import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=n ; i++){
			if(i==1 || i==n) {
				System.out.print("******");
			}
			else {
				System.out.print("*    *");
			}
			System.out.println();
		}
	}

}
