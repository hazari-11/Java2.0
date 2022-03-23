package JavaByHazari;

public class Swap {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		swap(a, b);
		
		// swapping using third variable
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		// swapping without using third variable
		
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
//		System.out.println(a + " " + b);
	}
	public static void swap(int x, int y){
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(x + " " + y);
	}
	
}
