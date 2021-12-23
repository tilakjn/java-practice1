package first;

public class evenwhile {
	public static void main(String[] args) {
		int sum=0,i=1;
			do {
			if(i%2==0)
				sum=sum+i;
			i++;
			}while(i<=200);
		System.out.printf("%d\n",sum);
		while(i<=200) {
			if(i%2==0)
				sum=sum+i;
			i++;
		}
		System.out.printf("%d",sum);
		
	}


}
