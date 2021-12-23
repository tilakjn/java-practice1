package first;

public class average {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int total=0;
		
		for(int i=0;i<arr.length;i++)
			total=total+arr[i];
		int average=total/5;
		
		System.out.printf("Average of five numbers: %d",average);

	}

}
