package first;

import java.util.Scanner;

public class arraysmlgre {

	public static void main(String[] args) {
		
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s1.nextInt();

    int numbers[]= new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s1.nextInt();
    }  
    
    int s;
	int g=s=numbers[0];

    for(int i=1;i<numbers.length;i++)
    {
    	if(numbers[i]>g)
    		g=numbers[i];
    	if(numbers[i]<s)
    		s=numbers[i];
    }
    
    System.out.println("greatest number of the array "+g);
    System.out.println("smallest number of the array "+s);
	}
}