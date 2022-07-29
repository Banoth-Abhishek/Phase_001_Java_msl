package PracticeAssisted;

public class innerClass2 {
	
	private String msg="Inner Class";
	
	void display(){
		class Inner{
			void msg(){
				System.out.println(msg);
			}
		}
		Inner I = new Inner();
		I.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClass2 ob = new innerClass2();
		ob.display();

	}

}
