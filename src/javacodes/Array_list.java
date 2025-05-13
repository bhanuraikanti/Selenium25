package javacodes;

import java.util.ArrayList;
import java.util.List;





public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mylist = new ArrayList();
		
//		List mylist = new ArrayList();
		mylist.add(100);
		mylist.add(9);
		mylist.add("wellcome");
		mylist.add("c");
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		System.out.println("size of an arraylist:"+mylist.size());//size of an arraylist:7  it will give the size
		
		System.out.println("arraylist data:"+mylist);//arraylist data:[100, 9, wellcome, c, null, null, 100]
//		to remove from list
		mylist.remove(6);
		mylist.remove(5);
		System.out.println("After removing:"+mylist);//After removing:[100, 9, wellcome, c, null]
	
		
		mylist.add(1234);
//		to insert in the list
		mylist.add(3,"12  34");
		mylist.add(1234);
		mylist.add(5,1234);
		System.out.println("arraylist data:"+mylist);//arraylist data:[100, 9, wellcome, 12  34, c, 1234, null, 1234, 1234]
		System.out.println(mylist.get(1)); 
		mylist.remove(0);
//		to modify
		mylist.set(7, 4321);
		System.out.println("After removing:"+mylist);//After removing:[9, wellcome, 12  34, c, 1234, null, 1234, 4321]
	System.out.println(mylist.get(1));  //wellcome

//	reading all elements from arraylist
//	using normal for loop
	
//	for(int i=0;i<mylist.size();i++)
//	{
//	System.out.println(mylist.get(i));
//	}
	
//	using for.. each loop
//	for(Object x:mylist)
//	{
//		System.out.println(x);
//	}
	
//	using iterator
	/* Iterator it = mylist.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	} */
//	Checking arraylist is empty or not
	System.out.println("Is arratlist is empty :"+mylist.isEmpty());//false
	
//	remove all elements from array list 
	ArrayList list = new ArrayList();
	list.add("wellcome");
	list.add(null);
	list.add(1234);
	mylist.removeAll(list);
	System.out.println("After removing multiple elements:"+mylist);
	mylist.clear();
	System.out.println("Is arratlist is empty :"+mylist.isEmpty());//true
	
			
			
	}

}
