package javacodes;
interface Car
{
	public String bookCab(String starting, String ending);
}

//class Ola implements Car
//{
//	public void bookCab(String starting, String ending) {
//		System.out.println("Ola cab is booked from "+starting+"  To  "+ending);
//	return ("Price : 5000 Rs");
//	}
//}
public class linterface {
	public static void main(String[] args) {
//		Car cab = new Ola();
		Car cab =(starting,ending)->{System.out.println("Ola cab is booked from "+starting+"  To  "+ending);
		    return ("Price : 5000 Rs");
			};
	 	System.out.println(cab.bookCab("Mdk", "Hnk"));
//		cab.bookCab("Mdk", "Hnk");
				
	}

}
