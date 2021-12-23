package first;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		int sum,sub,mul,div;
		char k='y';
		do{
		Scanner s=new Scanner(System.in);
		System.out.println("---Calculator--");
		System.out.println("Enter first no:");
		int n1=s.nextInt();
		System.out.println("Enter second no:");
		int n2=s.nextInt();
		System.out.println("select your option:\n1.Addtion\n2.Subtraction\n3.Multiplication\n4.Division");
		int choice=s.nextInt();
		switch(choice) {
		case 1:sum=n1+n2;
		System.out.printf("sum is %d\n",sum);
		break;
		case 2:sub=n1-n2;
		System.out.printf("sub is %d\n",sub);
		break;
		case 3:mul=n1*n2;
		System.out.printf("mul is %d\n",mul);
		break;
		case 4:div=n1/n2;
		System.out.printf("div is %d\n",div);
		break;
		default:System.out.println("Enter valid choice");
		}
		System.out.println("Do you want to continue?(y/n)");
		k=s.next().charAt(0);
		}while(k=='y'|| k=='Y');
		System.out.println("Thank You");
		

	}

	

}
