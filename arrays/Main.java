package arrays;

public class Main {

	public static void main(String[] args) {
		
//      datatype[] variable_name = new datatype[size];	
		
//		int[] rollNo = new int[5];
//		int[] rollNo2 = {23, 12, 45, 32, 60};
		
		int[] ros; // declaration of array, ros is getting defined in the stack
		ros = new int[5]; // initialisation : actually here object is being created i the memory(heap)
		
		System.out.println(ros[1]);
		
		String[] arr = new String[4];
		System.out.println(arr[0]);
		
//		for(String element : arr) {
//			System.out.println(element);
//		}
		
		// Primitive data types are stored in stack but all complex data types like array objects, string objects are stored in heap memory using new keyword
		
	}
}
