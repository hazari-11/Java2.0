package JavaByHazari;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
	   // fun(56,738,2,58,73);
		//multiple(34, 54,"Rupesh", "Kr", "Hazari");
		demo(2,5,3,6);
		demo("Rupesh","Rahul");
	}
	
	static void demo(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	
    static void demo(String ...v) {
    	System.out.println(Arrays.toString(v));
	}
	
	static void fun(int ...v) { // array of integers (variable length arguments)
		System.out.println(Arrays.toString(v));
	}
	
	static void multiple(int a, int b, String ...v) {
		System.out.print(a + " " + b + " " + Arrays.toString(v));
	}
}
