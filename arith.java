package first;

public class arith {

	public static void main(String[] args) {
		
		 for(int i=0;i<=10;i++)
		    {
			 try {
				 if((100/i)!=0) 
					 System.out.println(i); 
				 
		    }  
			 catch(Exception e)
		        {
		            System.out.println("Exception in code : "+e);
		        }
		    }

	}

}

	