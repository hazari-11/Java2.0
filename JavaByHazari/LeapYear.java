package JavaByHazari;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean ans = false;
		if(x%4==0 && x%400==0) {
			ans = true;}
		else if(x%400==0) {
			ans = true;
		}
		else if(x%4==0 && x%100!=0) {
			ans = true;
		}
		if(ans == true) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
