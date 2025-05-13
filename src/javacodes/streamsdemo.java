package javacodes;

import java.util.ArrayList;
import java.util.List;

class Product					//Filter method
{
	int id;
	String name;
	double price;
	
	public Product (int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class streamsdemo {

	public static void main(String[] args) {
		List <Product>productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1,"HP Laptop",25000));
		productsList.add(new Product(2,"acer Laptop",35000));
		productsList.add(new Product(3,"Dell Laptop",50000));
		productsList.add(new Product(4,"Lenovo Laptop",24000));
		productsList.add(new Product(5,"Asus Laptop",95000));
		
		productsList.stream()
								.filter(p->p.price>25000)
//			.forEach(pd->System.out.println(pd.name));
								 .forEach(pd->System.out.println(pd.name +" Rs"+pd.price));
		
	}

}
