package Live_assign;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Started Java");
		s.append("Phase1");
		System.out.println(s);
		
		s.delete(2,5);
		System.out.println(s);
		
		s.replace(8,11,"Python");
		System.out.println(s);
		
		s.insert(4, "language");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		System.out.println(s.charAt(9));
		
		

	}

}
