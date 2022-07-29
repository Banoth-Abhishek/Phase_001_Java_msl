package PracticeAssisted;

//parameterized constructor
class student{
	int id;
	String name;
   student(int i,String n){
	   id=i;
	   name=n;
   }
   void diplay(){
	   System.out.println(id+" "+name);
	   
   }
}
public class paraConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student S1 = new student(1,"VIRAT");
		student S2 = new student(4,"PRABA");
		S1.diplay();
		S2.diplay();

	}

}
