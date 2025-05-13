package javacodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamMapping {

	public static void main(String[] args) {

		List<String> vechiles = Arrays.asList("bus","car","cycle","bike");
		List<String> inUppercase = new ArrayList<String>();
//		Beffore using streams or java 8
	/*	for (String n:vechiles)
		{
			inUppercase.add(n.toUpperCase());
		}*/
		
	inUppercase =	vechiles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		
		
		System.out.println(inUppercase);

		
		
		
	}

}
