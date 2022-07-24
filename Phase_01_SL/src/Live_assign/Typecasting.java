package Live_assign;

public class Typecasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	float f = 52.6f;
	long L = (long)f;
	System.out.println("Float: "+f);
	System.out.println("Float to Long: "+L);
	
	double d = 65.562896;
	long L2 = (long)d;
	int i = (int)L2;
	char c = (char)i;
	System.out.println("Double: "+d);
	System.out.println("Double to Long: "+L2);
	System.out.println("Long to Integer: "+i);
	System.out.println("Interger to Character: "+c);
	
	long L3 = 456874;
	byte b = (byte)L3;
	System.out.println("Long: "+L3);
	System.out.println("Long to Byte: "+b);
	
	int i2 = 97;
	double d2 = i2;
	long L4 = (long)d2;
	System.out.println("Integer: "+i2);
	System.out.println("Interger to Double: "+d2);
	System.out.println("Double to Long: "+L4);
	}

}
