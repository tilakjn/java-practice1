package first;

import java.util.ArrayList;

public class list6 {

	public static void main(String[] args) {
		ArrayList<books> list=new ArrayList<>();
		
		books b=new books("qwerty",1111,300,"gffg");
		books b1=new books("uiopa",11221,400,"fhh");
		list.add(b);
		list.add(b1);
		
		for(books x:list) {
			System.out.println(x.bookname+" "+x.id+" "+x.price+" "+x.author);
		}

	}

}

class books{
	String bookname;
	int id,price;
	String author;
	public books(String bookname, int id, int price, String author) {
		super();
		this.bookname = bookname;
		this.id = id;
		this.price = price;
		this.author = author;
	}
	
}