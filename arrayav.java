package first;

import java.util.Scanner;

public class arrayav {

	public static void main(String[] args) {
		int sum=0;
		double avg=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();

    int numbers[]= new int[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    numbers[i]=s.nextInt();
    }      

    for(int i=0;i<numbers.length;i++)
    {

    sum=sum+numbers[i];
    avg=sum/size;
    }
    System.out.println("average of the array "+avg);
	}
}

