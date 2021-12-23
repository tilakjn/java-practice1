package first;

import java.util.Scanner;

public class seven {
	static int factorial(int n1) {
		if(n1==0)
			return 1;
		else
			return (n1*factorial(n1-1));
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		seven f=new seven();
		int i,fact=1;
		System.out.println("enter the number");
		int n=s.nextInt();
		fact=factorial(n);
		System.out.printf("factorial is %d\n",fact);
	}

}
