package first;
import java.util.Scanner;
public class fact2 {
	static int factorial(int n1) {
		if(n1==0)
			return 1;
		else
			return (n1*factorial(n1-1));
	}
	float sum(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		fact2 f=new fact2();
		int i,fact=1;
		System.out.println("enter the number");
		int n=s.nextInt();
		fact=factorial(n);
		System.out.printf("factorial is %d\n",fact);
		float m=f.sum(150.5f,120.6f);
		System.out.printf("sum is %f\n",m);
	}

}
