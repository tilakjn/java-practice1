package first;

import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   int i, j, rows;
		   System.out.println("Enter the number of rows: ");
		   rows=s.nextInt();
		   for (i = 1; i <= rows; ++i) {
		      for (j = 1; j <= i; ++j) {
		    	  System.out.printf("%d ", j);
		      }
		      System.out.print("\n");
		   }
		 

	}

}
