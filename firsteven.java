package first;

public class firsteven {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=200;i++)
			if(i%2==0)
				sum=sum+i;
		System.out.printf("%d",sum);
	}

}
