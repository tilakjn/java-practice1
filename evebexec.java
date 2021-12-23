package first;

import java.util.Scanner;

public class evebexec {
	public static void main(String aa[]) throws MyExcep
    {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the number");
	 int num=s.nextInt();
         if(num%2!=0)
         {
             throw new MyExcep("not even no exception");
         }
         else
        	 System.out.println("even no");
    }
}
 

class MyExcep extends Exception {
	public MyExcep(String message) {
		super(message);
	}
}