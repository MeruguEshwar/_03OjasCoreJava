package _01BasicPrograms;

public class _07AreaOfTriangleUsingConstructor {
	
	public double b;
	public double h;
	double area;
	
	_07AreaOfTriangleUsingConstructor(double b,double h) {
		area = (b*h)/2;
	}

	public static void main(String[] args) {
		_07AreaOfTriangleUsingConstructor atc = new _07AreaOfTriangleUsingConstructor(5,2);
		System.out.println("Area Of Triangle is:"+atc.area);
	}

}
