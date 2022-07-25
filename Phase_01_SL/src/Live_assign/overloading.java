package Live_assign;

public class overloading {
	
	public int calculate(int a,int b){
		return a+b;				
	}
	public int calculate(double r){
		return (int)(3.14*r*r);
	}
	public int calculate(float l, int b){
		return (int) (l*b);
	}
	public int calculate(int s){
		return s*s;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading OV = new overloading();
		System.out.println("Addition of two numbers: "+OV.calculate(20,50));
		System.out.println("Area of circle: "+OV.calculate(5d));
		System.out.println("Area of rectangle: "+OV.calculate(10f,5));
		System.out.println("Area of square: "+OV.calculate(20));
		
	
		}

	}

