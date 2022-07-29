package PracticeAssisted;

public class Callmethod {
	
	int val =150;
	
	int operation(int val){
		val = val*10/100;
		return (val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callmethod ob = new Callmethod();
		System.out.println("Before calling the value: "+ob.val);
		ob.operation(100);
		System.out.println("After calling the value: "+ob.val);
	}

}
