package PracticeAssisted;

public class methodoverloading {
	public void area(int b, int h){
		System.out.println("Area of the Triangle: "+(0.5*b*h));
	}
	
	public void area(int r){
		System.out.println("Area of the circle: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading ol = new methodoverloading();
		ol.area(10,5);
		ol.area(8);

	}

}
