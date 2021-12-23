package first;

import java.util.Scanner;

public class arrayvow {
	public static void main(String[] args) {
		int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=s.nextInt();

    char vowels[]= new char[size];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++)
    {
    vowels[i]=s.next().charAt(0);
    }      

    for(int i=0;i<vowels.length;i++)
    {
    	if(vowels[i]=='a'||vowels[i]=='e'||vowels[i]=='i'||vowels[i]=='o'||vowels[i]=='u'||vowels[i]=='A'||vowels[i]=='E'||vowels[i]=='I'||vowels[i]=='O'||vowels[i]=='U') {
    		System.out.println("array element is vowel "+vowels[i]);
    		count++;
    	}
    	else {
    		System.out.println("array element is consonent "+vowels[i]);
    	}

    }
    System.out.println("total number of vowels in array is "+count);
	}
}
