package _23Stream;

import java.util.ArrayList;
import java.util.List;

public class _04ProductDetailsWithoutUsingStream {
	private int id;
	private String name;
	private float price;
	
	
	public _04ProductDetailsWithoutUsingStream(int id, String name, float price) {
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
		 List <_04ProductDetailsWithoutUsingStream> productsList = new ArrayList <_04ProductDetailsWithoutUsingStream> (); 
		 
		 productsList.add(new _04ProductDetailsWithoutUsingStream(1,"HP Laptop",25000f));
		 productsList.add(new _04ProductDetailsWithoutUsingStream(2,"Lenovo",35000f));
		 productsList.add(new _04ProductDetailsWithoutUsingStream(3,"Dell Laptop",45000f));
		 productsList.add(new _04ProductDetailsWithoutUsingStream(4,"Thinkpad Laptop",55000f));
		 
		 
		 List <Float> productPriceList =new ArrayList <Float> (); 
		 for(_04ProductDetailsWithoutUsingStream prise:productsList) {
			 if(prise.getPrice()<35000) {
				 productPriceList.add(prise.getPrice());
			 }
		 }
		 
		 for(Float p:productPriceList) {
			 System.out.println(p);
		 }
	}

}
