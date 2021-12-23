package first;

import java.util.ArrayList;

public class list7 {

	public static void main(String[] args) {
		
		ArrayList<Friend> list=new ArrayList<>();
		Friend f1=new Friend("xyz","abc",575759);
		Friend f2=new Friend("pqr","wxy",895656);
		list.add(f1);
		list.add(f2);
		
		for(Friend f: list)
		{
		System.out.println("name is: "+f.name+"\nnick name is: "+f.nickName+"\ncontact is: "+f.contact+"\n");
		
		}

	}

}

class Friend{
String name,nickName;
int contact;
public Friend(String name, String nickName, int contact) {
this.name=name;
this.nickName=nickName;
this.contact=contact;
}
}