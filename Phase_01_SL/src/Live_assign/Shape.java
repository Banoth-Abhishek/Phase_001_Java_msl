package Live_assign;

public class Shape {
	
	int side; //Declared for square
	int length,breadth;  //Declared for rectangle
	float radius;  //Declared for circle
	double r1,r2;  //Declared for Rhombus
	int base,height;  //Declared for Triangle
	 
	// default Constructor
	public Shape(){
		r1=5;
		r2=4;
		
		base=6;
		height=4;
	}
	
	                 //First Constructor overloading
	public Shape(int s){
		side=s;
	}
	
	                     //Second Constructor overloading
	public Shape(int l,int b){
		length=l;
		breadth=b;
	}
	
	                   //Third Constructor overloading
	public Shape(float r){
		radius=r;	
	}
	
	                 // method to display the values
	public void display(){
		System.out.println("Area of the square: "+(side*side));
	}
	
	public void display2(){
		System.out.println("Area of the rectangle: "+(length*breadth));
	}
	
	public void display3(){
		System.out.println("Area of the cricle: "+(3.14*radius*radius));
	}
	
	public void display4(){
		System.out.println("Area of the rohmbus: "+(0.5*r1*r2));
		
	}

	public void display5(){
		System.out.println("Area of the triangle: "+(0.5*base*height));
	}

	public static void main(String[] args) {
		     //creating objects and passing values
		Shape S1 = new Shape(7);
		Shape S2 = new Shape(9,8);
		Shape S3 = new Shape(4f);
		Shape S4 = new Shape();
		Shape S5 = new Shape();
		
		//calling method to display the values of object  
		S1.display();
		S2.display2();
		S3.display3();
		S4.display4();
		S5.display5();
	
	}

}


