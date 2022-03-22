package JavaByHazari;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empID = sc.nextInt();
		String department = sc.next();
		
		switch(empID) {
		case 1:
			System.out.println("Rupesh Kr. Hazari");
			break;
		case 2:
			System.out.println("Dhanbad");
			break;
		case 3:
			System.out.println("Emp number 3");
			switch(department) {
			case "IT":
				System.out.println("IT Department");
				break;
			case "Management":
				System.out.println("Management Department");
				break;
		    default:
					System.out.println("No department entered");
			}
			break;
		default:
				System.out.println("Enter correct EmpID");
		}
	}

}
