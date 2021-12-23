package first;
import java.util.Scanner;


public class bill {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=0,n2=0,n3=0,n4=0,total=0;
		char k='y';
		do {
		System.out.println("---Bill for Order---");
		System.out.println("1.Breakfast\n2.lunch\n3.Dinner");
		int c=s.nextInt();
		if(c==1 || c==2 ||c==3)
		{
	    while(k=='y'|| k=='Y'){
			System.out.println("1.coffe\n2.Tea\n3.pizza\n4.Juice");
			int choice=s.nextInt();
			if(choice==1) 
				n1=50;
			else if(choice==2) 
				n2=50;
			else if(choice==3) 
				n3=300;
			else if(choice==4) 
				n4=100;
			else
				System.out.println("Enter valid choice");
			System.out.println("Do you want to order more?(y/n)");
			k=s.next().charAt(0);
			}
		}
        total=n1+n2+n3+n4;
        System.out.printf("Bill is %d\n",total);
        System.out.println("Do you want to order more?(y/n)");
		k=s.next().charAt(0);
	}while(k=='y'|| k=='Y');
	
        
	}

}
