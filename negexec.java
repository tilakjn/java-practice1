package first;

import java.util.Scanner;

public class negexec {
	public static void main(String aa[]) throws MyExcep
    {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the number");
	 int num=s.nextInt();
         if(num<0)
         {
             throw new MyExcep("Negative no exception");
         }
         else
        	 System.out.println("positive no");
    }
}
 

class MyExcep extends Exception
{
 
    public MyExcep(String message) {
        super(message);

    }

}
