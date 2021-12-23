package first;

public class callbill {

	public static void main(String[] args) {
	int bill=0;
	int call=301;
	if(call<=100)
		bill=0;
	else if(call>100 && call<=200)
	{
		call=call-100;
		bill=call*1;
	}	
	else if(call>200 && call<=300) {
		call=call-100;
		int temp=call-100;
		bill=100*1+temp*2;
	}
	else {
		call=call-100;
		int temp=call-200;
		bill=100*1+100*2+temp*3;
		
	}
	
	System.out.printf("%d",bill);

	}

}
