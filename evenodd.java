package first;
import java.util.Scanner;
public class evenodd {
	int g=0;
		int method(int n) {
		if(n>0)
			return 1;
		else
			return 0;
	}
		int method2(int x) {
			if(x%2==0)
				return 1;
			else
				return 0;
		}
		int sum(int y) {
			for(int i=1;i<=y;i++) {
				g=g+i;
			}
			return g;
		}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		evenodd e=new evenodd();
		System.out.println("enter the number");
		int n1=s.nextInt();
		int k=e.method(n1);
		if(k==1)
			System.out.println("positive");
		else
			System.out.println("negative");
		System.out.println("enter the number");
		int n2=s.nextInt();
		int l=e.method2(n2);
		if(l==1)
			System.out.println("even");
		else
			System.out.println("odd");
		int m=e.sum(100);
		System.out.printf("%d",m);
		
	
	}

}
