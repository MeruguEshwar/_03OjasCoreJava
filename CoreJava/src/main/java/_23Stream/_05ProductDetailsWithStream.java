package _23Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _05ProductDetailsWithStream {
	
	private int id;
	private String name;
	private float price;
	
	public _05ProductDetailsWithStream(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


										
	
	public static void main(String[] args) {
		
		List <_05ProductDetailsWithStream> productsList = new ArrayList <_05ProductDetailsWithStream> (); 
		 
		 productsList.add(new _05ProductDetailsWithStream(1,"HP Laptop",25000f));
		 productsList.add(new _05ProductDetailsWithStream(2,"Lenovo",35000f));
		 productsList.add(new _05ProductDetailsWithStream(3,"Dell Laptop",45000f));
		 productsList.add(new _05ProductDetailsWithStream(4,"Thinkpad Laptop",55000f));
		 
		 List<Float> list = productsList.stream().filter(p->p.getPrice()>25000)
				 								 .map(p->p.getPrice())
				 								 .collect(Collectors.toList());
		 list.forEach(System.out::println);
	}


		
}
