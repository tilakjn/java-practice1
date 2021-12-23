package first;

import java.util.Scanner;

public class stringexce {
	public static void main(String aa[]) throws MyExcep
    {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the password");
	 String str=s.nextLine();
         if(str.length()<10)
         {
             throw new MyExcep("password not matched exception");
         }
         else
        	 System.out.println("pasword matched");
    }
}
 

class MyExcep extends Exception
{
 
    public MyExcep(String message) {
        super(message);

    }

}


