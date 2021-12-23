package first;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int count=0;
		 System.out.println("Enter the string: ");
		 str=s.nextLine();
		 System.out.println("Enter the charcter: ");
		 ch=s.next().charAt(0);
		 for(int i=0;i<str.length();i++) {
			 if(ch==str.charAt(i)) {
				 count++;
			 }
			 
		 }
		 System.out.println("Frequency of charcter "+ch+" is : "+count);


	}

}
