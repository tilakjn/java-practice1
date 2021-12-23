package first;

public class greatfour {

	public static void main(String[] args) {
		int number1=10,number2=20,number3=30,number4=40;
		if(number1 > number2)
	      {
	         if(number1 > number3)
	         {
	            if(number1 > number4)
	            {  
	               System.out.println("Largest of four numbers is: " + number1);
	            }
	            else
	            {
	               System.out.println("Largest of four numbers is: " + number4);
	            }
	         }
	      }
	      else if(number2 > number3)
	      {
	         if(number2 > number4)
	         {
	            System.out.println("Largest of four numbers is: " + number2);
	         }
	         else
	         {
	            System.out.println("Largest of four numbers is: " + number4);
	         }
	      }
	      else if(number3 > number4)
	      {
	         System.out.println("Largest of four numbers is: " + number3);
	      }
	      else
	      {
	         System.out.println("Largest of four numbers is: " + number4);
	      }
	}

}
