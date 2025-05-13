package javacodes;


@FunctionalInterface
interface Cab
{
	public void bookcab();
}

//class Ola implements Cab
//{
//	public void bookcab() {
//		System.out.println("Ola cab is booked......");
//	}
//}

public class fninter {
	
	public static void main(String[] args) {
//		Ola cab = new Ola();
//		Cab cab =new Ola();
		Cab cab=()->System.out.println("Ola cab is booked.....");
		cab.bookcab();
	}

}
