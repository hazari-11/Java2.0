package JavaByHazari;

import java.util.*;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if(a>b) {
//			if(a>c)
//				System.out.println(a);
//			else
//				System.out.println(c);
//		}
//		else {
//			if(b>c)
//				System.out.println(b);
//			else
//				System.out.println(c);
//		}
	    int x = Math.max(Math.max(a, b),c);
		System.out.println(x);
	}

}
