package javacodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
//		Set set = new HashSet();
//		HashSet <String> set = new HashSet<String>();
		
		
		set.add(100);
		set.add(null);
		set.add(1000);
		set.add(10.9);
		set.add("welcome");
		set.add('A');
		set.add(100);
		set.add(null);
		
		System.out.println("size of set:"+set.size());
//		printing hashset
		System.out.println("set data:"+set);//set data:[null, A, 100, 1000, 10.9, welcome]
		
//		removing element
		set.remove("welcome");
		System.out.println("set data:"+set);//set data:[null, A, 100, 1000, 10.9]
		
//		inserting element = is not possible 
//		access specific element is not possible
		
//		converting hashset into Arraylist
		ArrayList list = new ArrayList(set);
		System.out.println(list);//[null, A, 100, 1000, 10.9]
		System.out.println(list.get(3));
		
//		read all the elements using for...loop
		/*for(Object x : set) {
			System.out.println(x);
		}*/
		
		Iterator <Object>it = set.iterator(); 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		clearing the elements in set
//		set.clear();
		set.removeAll(set);
		System.out.println(set);
		System.out.println(set.isEmpty());
	
		
	}

}
