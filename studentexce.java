package first;

import java.util.Scanner;

public class studentexce {
	 public static void main(String aa[]) throws MyExcep
	    {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the marks");
		 int marks=s.nextInt();
	         if(marks<200)
	         {
	             throw new MyExcep("failed exception");
	         }
	         else
	        	 System.out.println("passed");
	    }
	}
	 

	class MyExcep extends Exception
	{
	 
	    public MyExcep(String message) {
	        super(message);

	    }
	}


