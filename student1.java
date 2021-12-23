package first;

public class student1 {

	
		public static void main(String[] args) {
			student2 e1=new student2();
			student2 e=new student2("Tilak");
			System.out.println(e1.getDetails());
			System.out.println(e.getDetails());
			}

		}
		class student2{
			String name;
			student2(String x){
				name=x;
			}
			student2(){
				name="unknown";
			}
			String getDetails(){
				return name;
			}
			
		}