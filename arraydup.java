package first;

import java.util.Scanner;

public class arraydup {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();

    int numbers[]= new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s.nextInt();
    }      
    for(int i=0;i<size;i++) {
    	for(int j=i+1;j<size;j++) {
    		if(numbers[i]==numbers[j]) {
    			 System.out.println("duplicate element is"+numbers[j]);
    }}}
	}

}
