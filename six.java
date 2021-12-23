package first;
import java.util.*;
public class six {

	public static void main(String[] args) {
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second numer");
		int b=s.nextInt();
		System.out.println("a="+a+" b="+b+" before swaping\n");
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+" b="+b+" after swaping\n");

	}

}
