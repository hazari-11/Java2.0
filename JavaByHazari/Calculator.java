package JavaByHazari;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		while(true) {
			System.out.print("Enter the operator : ");
			char op = sc.next().trim().charAt(0);
			if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
				System.out.print("Enter two numbers : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(op=='+') {
					ans = a+b;
				}
				if(op=='-') {
					ans = a-b;
				}
				if(op=='*') {
					ans = a*b;
				}
				if(op=='/') {
					if(b!=0) {
						ans = a/b;
					}
				}
				if(op=='%') {
					ans = a%b;
				}
			}
				else if(op=='x' || op=='X') {
					break;
				}
				else {System.out.println("Invalid Operation");}
			
			System.out.println(ans);
		}	
}
}
