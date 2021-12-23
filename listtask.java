package first;

import java.util.ArrayList;
import java.util.Collections;

public class listtask {

	public static void main(String[] args) {
		int f=0;
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> prime=new ArrayList<>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		for(Integer x:list) {
			
			boolean prime1 = true;


			if(x % 2 == 0){
			prime1 = false;
			}
			else {
			for(int i=3; i*i<=x; i+=2) {
			if(x % i == 0) {
			prime1 = false;
			}
			}
			}
			if(prime1){
				prime.add(x);
				}
			
			if(x%2==0) {
				even.add(x);
			}
			else {
				odd.add(x);
			}
				
		}
		
		System.out.println("even list:");
		for(Integer x:even) {
			System.out.println(x);
	}
		System.out.println("odd list:");
		for(Integer x:odd) {
			System.out.println(x);
	}
		System.out.println("prime list:");
		for(Integer x:prime) {
			System.out.println(x);
	}

}
}
