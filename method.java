package first;
import java.util.Scanner;
public class method {
	void area(int x) {
		System.out.println(x*x);
	}
	void area(int y,int z) {
		System.out.println(y*z);
	}
	void area1(int p) {
		System.out.println(3.14*p*p);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		method m=new method();
		System.out.println("enter the side of square");
		int n=s.nextInt();
		m.area(n);
		System.out.println("enter the sides of rectangle");
		int a=s.nextInt();
		int b=s.nextInt();
		m.area(a,b);
		System.out.println("enter the radius of circle");
		int r=s.nextInt();
		m.area1(r);
		
		
		

	}

}
