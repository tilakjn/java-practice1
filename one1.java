package first;

public class one1 {

	public static void main(String[] args) {
		String str="Hello",reverse="";
		char c;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			reverse=c+reverse;
		}
		System.out.println(str);
  System.out.println(reverse);
	}

}
