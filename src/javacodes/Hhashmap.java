package javacodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap mp = new HashMap();
//		Map mp = new HashMap();

		HashMap  <Integer,String> mp = new HashMap<Integer,String>();
		
//		Adding pairs
		mp.put(101,"sai");
		mp.put(102,"venkat");
		mp.put(103, "abhi");
		mp.put(104, "map");
		mp.put(103, "bhanu");
		System.out.println("size of hashmap:"+mp.size());//size of hashmap:4
		System.out.println(mp);//{101=sai, 102=venkat, 103=bhanu, 104=map}
		
//		remove pair
		mp.remove(103);//103  is key of the pair
		System.out.println("after removing the pair:"+mp);//after removing the pair:{101=sai, 102=venkat, 104=map}
		
//		access the value of the key
		System.out.println(mp.get(104));//map
		
		//get all the keys from hashmap
		System.out.println(mp.keySet());//[101, 102, 104]
		System.out.println(mp.values());//[sai, venkat, map]
		System.out.println(mp.entrySet());//[101=sai, 102=venkat, 104=map]
		
//		reading data from hashmap
//		using for..each
	/*	for(int k:mp.keySet())
		{
			System.out.println(k+"     "+mp.get(k ));
		}*/
		
//		using iterator
		Iterator <Entry<Integer, String>>it=mp.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();		
		System.out.println(entry.getKey()+"      "+entry.getValue());
		}
		mp.clear();
		System.out.println(mp);
		System.out.println(mp.isEmpty());
	}

}
