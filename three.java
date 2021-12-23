package first;
import java.util.*;
public class three {
	static int pow(int x,int y) {
		int power=1;
		for(int i=1;i<=y;i++) {
			power*=x;
		}
		return power;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("enter the power");
		int p=s.nextInt();
		System.out.print("power is "+pow(n,p));
		
	}

}
