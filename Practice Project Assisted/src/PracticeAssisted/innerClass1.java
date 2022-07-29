package PracticeAssisted;

public class innerClass1 {
	private String msg ="Java Programming Language";
	
	class Inner{
		void hello(){
			System.out.println(msg+" Is Inner Class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     innerClass1 ob = new innerClass1();
     innerClass1.Inner in = ob.new Inner();
     in.hello();
	}

}

