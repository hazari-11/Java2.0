package JavaByHazari;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your good name : ");
		String x = sc.next();
		System.out.println(Greet(x));
	}
	public static String Greet(String a) {
		String b = "Hello "+a;
		return b;
	}
}
