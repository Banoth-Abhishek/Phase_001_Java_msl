package PracticeAssisted;

import java.util.*;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     System.out.println("ArrayList");
     ArrayList<String>city = new ArrayList<String>();
     city.add("Hyderabad");
     city.add("Pune");
     System.out.println(city);
     
                                //creating vector
     System.out.println("\n");
     System.out.println("Vector");
     Vector<Integer>vec = new Vector();
     vec.addElement(25);
     vec.addElement(40);
     System.out.println(vec);
     
                                //creating linkedlist
     System.out.println("\n");
     System.out.println("LinkedList");
     LinkedList<String>names = new LinkedList();
     names.add("Jhon");
     names.add("Milky");
     Iterator<String>itr = names.iterator();
     while(itr.hasNext()){
    	 System.out.println(itr.next());
    	 
    	                         //creating hashset
    	 System.out.println("\n");
    	 System.out.println("HashSet");
    	 HashSet<Integer> set = new HashSet<Integer>();
    	 set.add(112);
    	 set.add(115);
    	 set.add(116);
    	 set.add(117);
    	 System.out.println(set);
    	 
    	                        //creating linkedhashset
    	 
    	 System.out.println("\n");
    	 System.out.println("LinkedHashSet");
    	 LinkedHashSet<Integer>set2 = new LinkedHashSet();
    	 set2.add(120);
    	 set2.add(130);
    	 set2.add(140);
    	 set2.add(150);
    	 System.out.println(set2);
    	 
     }
    
     
	}

}
