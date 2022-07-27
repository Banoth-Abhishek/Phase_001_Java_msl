package phase_01_projects;
import java.util.Scanner;

public class ArithmeticCalculate {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Get input from user
	
		char op;
		double n1;
		double n2;
		
	while(true){
		System.out.println("Enter the Mathematical Oparator(+;-;*;/;E=EXIT):");
		op = sc.next().charAt(0);
		if(op=='+'){
			System.out.println("Enter the First Number: ");
			n1 = sc.nextDouble();
			System.out.println("Enter the Second Number:");
			n2 = sc.nextDouble();
			System.out.println("Addition of two Given Numbers is: "+(int)(n1+n2));
			
		}
		else if(op=='-'){
			System.out.println("Enter the First Number: ");
			n1 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			n2 = sc.nextInt();
			System.out.println("Subtraction of two Given Numbers is: "+(int)(n1-n2));	
			
		}
		else if(op=='*'){
			System.out.println("Enter the First Number: ");
			n1 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			n2 = sc.nextInt();
			System.out.println("Multiplication of two Given Numbers is: "+(int)(n1*n2));
			
		}
		else if(op=='/'){
			System.out.println("Enter the First Number: ");
			n1 = sc.nextInt();
			System.out.println("Enter the Second Number:");
			n2 = sc.nextInt();
			System.out.println("Division of two Given Numbers is: "+(n1/n2));
			
			
		}
		else if(op=='E'){
			System.out.println("EXIT");
			break;
		}
		 else{
			System.out.println("You have given Invalid Input");
			}
	}
	
	}

}
