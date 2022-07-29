package PracticeAssisted;
 //Default Constructor
 class Empinfo{
	 int id;
	 String name;
	 
	 void display(){
		 System.out.println(id+" "+name);
	 }
 }

public class DcEmpinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empinfo emp1 = new Empinfo();
		Empinfo emp2 = new Empinfo();
		emp1.display();
		emp2.display();
		
		

	}

}
