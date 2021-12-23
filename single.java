package first;
import java.util.Scanner;
public class single {
	int m1,m2,m3;
	public static void main(String[] args) {
		
result r=new result();
r.readDetails();

r.readMarks();
System.out.println("student details: "+r.getDetails());
System.out.println("student marks: "+r.getMarks());
r.calculateResult();
r.display();

mpcmarks m=new mpcmarks();
cecmarks C=new cecmarks();
m.Readmpcmarks();
m.dispmpc();
C.Readcecmarks();
C.dispcec();
	}

}
class student3{
	Scanner s=new Scanner(System.in);
	int studentId;
	String studentName,phone;
	
	void readDetails(){
		System.out.println("enter name of the student:");
		studentName=s.nextLine();
		
		System.out.println("enter the student phone:");
		phone=s.nextLine();
		System.out.println("enter the student id:");
		studentId=s.nextInt();
	}
	
	String getDetails() {
		return studentId+" "+studentName+" "+phone;
	}
	
}
class marks extends student3{
	int m1,m2,m3;
	
	void readMarks() {
		System.out.println("enter marks1:");
		m1=s.nextInt();
		System.out.println("enter marks2:");
		m2=s.nextInt();
		System.out.println("enter marks3:");
		m3=s.nextInt();
	}
	
	String getMarks() {
		return m1+" "+m2+" "+m3;
	}
}
class result extends marks{
	int total,percentage;
	String grade;
	void calculateResult() {
		total=m1+m2+m3;
		percentage=total*100/300;
		if(percentage<35) {
			grade="fail";
		}
		else if(percentage>=35 && percentage<=85 ) {
			grade="first class";
		}
		else {
			grade="distinction";
			
		}
	}
	void display() {
		System.out.printf("total marks:  %d\n",total);
		System.out.printf("percentage: %d\n",percentage);
		System.out.printf("grade: %s\n",grade);
		
	}
}
class mpcmarks extends student3{
	int m,p,c;
	void Readmpcmarks() {
		System.out.println("enter maths:");
		m=s.nextInt();
		System.out.println("enter physics:");
		p=s.nextInt();
		System.out.println("enter chemistry:");
		c=s.nextInt();
	}
	void dispmpc() {
		System.out.println(m+" "+p+" "+c);
	}
}

class cecmarks extends student3{
	int c1,e,c2;
	void Readcecmarks() {
		System.out.println("enter commerce:");
		c1=s.nextInt();
		System.out.println("enter economics:");
		e=s.nextInt();
		System.out.println("enter civics:");
		c2=s.nextInt();
	}
	void dispcec() {
		System.out.println(c1+" "+e+" "+c2);
	}
}

