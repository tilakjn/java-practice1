package first;
import java.util.*;
public class four {

	public static void main(String[] args) {
		char ch;
		int count=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++) {
		System.out.println("enter characters");
		ch=s.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			count++;
		}
		System.out.printf("number of vowels is= %d\n",count);
	}

}
