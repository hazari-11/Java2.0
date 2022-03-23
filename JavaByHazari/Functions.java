package JavaByHazari;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println((sum(num1,num2)));
	}
	public static int sum(int x, int y) {

		int add = x+y;
		return add;
	}

}
