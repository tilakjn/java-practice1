package first;

import java.util.Scanner;

public class areamethod {
	int area(int x) {
		return x*x;
	}
	int area(int y,int z) {
		return y*z;
	}
	double area1(double p) {
		return (3.14*p*p);
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		areamethod m=new areamethod();
		System.out.println("enter the side of square");
		int n=s.nextInt();
		System.out.println(m.area(n));
		System.out.println("enter the sides of rectangle");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(m.area(a,b));
		System.out.println("enter the radius of circle");
		double r=s.nextInt();
		System.out.println(m.area1(r));
		
	}

}
