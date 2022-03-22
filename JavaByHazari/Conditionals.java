package JavaByHazari;

import java.util.*;

public class Conditionals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		int salary = sc.nextInt();
		if(salary>20000)
			salary+=3000;
		else if(salary>10000)
			salary+=2000;
		else
			salary+=1000;
		System.out.println("New Salary : " + salary);
		}
}
