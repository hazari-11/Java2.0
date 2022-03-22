package JavaByHazari;

import java.util.*;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// In implicit conversion/automatic conversion/widening conversion, Destination type should be greater than the source type 
		// float num = input.nextFloat();
//		int num = sc.nextInt();
//		System.out.println(num);
		
		
		//compressing the bigger no in a smaller type explicitly is called explicit/narrowing conversion
//		int num = (int)(87.99f);
//		System.out.println(num);
//		
		//automatic type promotions in expressions
		// max. value we can store in a byte is 256
//		int a = 257;
//		byte b = (byte)(a); // 257 % 256 = 1
//		System.out.println(b);
		
//		byte a = 40;
//		byte b = 50;
//		byte c = 100;
//		int d = (a*b)/c;		
//		System.out.println(d);
		
//		byte b =50; // error
//		b = b*2;
		
//		int number = 'A';
//		System.out.println(number);  // printing ASCII value
		
//		System.out.println(2*5);
		
		byte b =42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f*b)+(i/c)-(d*s);
		System.out.println((f*b)+ " " +(i/c)+ " "+ (d*s));
		//lower values will be promoted to higher values so,
		// b is promoted to f
		// c is promoted to i
		// s is promoted to d
		System.out.println(result);
		// Total output is float+integer-double = max of all = double
		
	}

}
