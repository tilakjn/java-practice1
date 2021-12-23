package first;

public class electricbill {

	public static void main(String[] args) {
		int bill=0;
		int unit=152;
		if(unit<=50)
			bill=0;
		else if(unit>50 && unit<=100)
		{
			unit=unit-50;	
			bill=unit*6;
		}
		else if(unit>100 && unit<=150)
		{
			unit=unit-100;
			bill=50*6+unit*8;
		}
		else
		{
			unit=unit-150;
			bill=50*6+50*8+unit*9;
		}
		System.out.printf("%d",bill);
	}

}
