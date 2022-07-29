package PracticeAssisted;

public class methodExecution {
	public int multiplication(int a,int b){
		int z = a*b;
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodExecution ob = new methodExecution();
		int ans = ob.multiplication(10,5);
		System.out.println("Multiplication of two numbers: "+ans);
		

	}

}
