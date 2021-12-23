package first;

public class fact {

	public static void main(String[] args) {
		int fact=1,n=5,i=1;
		do {
			fact=fact*i;
			i++;
		}while(i<=n);
		System.out.printf("%d",fact);
	}

}
