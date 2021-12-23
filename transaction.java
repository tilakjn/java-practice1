package first;
import java.util.Scanner;

public class transaction {

	public static void main(String[] args) {
		enquiry e=new enquiry();
		withdrawal w=new withdrawal();
		deposit d=new deposit();
		e.execute();
		w.one();
		w.execute();
		d.two();
		d.execute();
	}
	}
class transact{
	Scanner s=new Scanner(System.in);
	int accountnumber,balance;
	 int getaccountNumber() {
		return accountnumber=111; 
	 }
	void execute() {
		System.out.printf("balance is %d\n",balance);
	}
}

class enquiry extends transact {
 
}

	class withdrawal extends transact
	{
		void one(){
		System.out.print("enter the withdrawal amount");
		int a=s.nextInt();
		balance=balance-a;
	  }
	}
	class deposit extends transact
	{
		void two(){
		System.out.print("enter the deposit amount");
		int b=s.nextInt();
		balance=balance+b;
	  }
	}
	
	
