package PracticeAssisted;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Tim");
		hm.put(2,"Mary");
		hm.put(3,"Catie");
		System.out.println("The elements of the HashMap are:");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		//HashTable
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(4,"Ales");
		ht.put(5, "Rosy");
		ht.put(6, "Jack");
		ht.put(7, "John");
		System.out.println("The elements of the Hashtable are:");
		for(Map.Entry m:ht.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
			
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(8, "Annie");
		map.put(9, "Carlotte");
		map.put(10, "catie");
		System.out.println("The elements of the TreeMap are:");
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());


	}

}
