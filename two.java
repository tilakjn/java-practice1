package first;

public class two {

	public static void main(String[] args) {
		
			int number = 4;
			int i, j;
			for(i = number; i >= 1; i--)
			{
				
				// space
				for(j = i; j < number; j++)
				{
					System.out.print(" ");
				}
				
				// star
				for(j = 1; j <= (2 * i - 1); j++)
				{
					System.out.print("*");
				}
				
				// Ending line 
				System.out.println("");
			}
	}

}
