package JavaByHazari;

public class LCM {

	public static void main(String[] args) {
		int x = 3;
		int y = 91;
		int LCM = (x/HCF(x,y))*y;
		System.out.println(LCM);
	}
	public static int HCF(int a , int b) {
		int ans = 0;
		for(int i=Math.min(a, b) ; i>=2 ; i--) {
			if(a%i==0 && b%i==0) {
				ans = i;
				break;
			}
			else { ans = 1;}
		}
		return ans;
	}

}
