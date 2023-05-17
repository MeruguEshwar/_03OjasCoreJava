package _15InnerClases;

abstract class Test {
	public abstract void eat();
}

interface Shape{
	 abstract void draw();
//	 abstract void food();
}

public class _01Anonymous{
	
	public static void main(String[] args) {
		Test t = new Test() {
			public void eat() {
				System.out.println("eat method is calling in abstract..");
			}
		};
		t.eat();
		
		Shape s = new Shape() {
			public void draw() {
				System.out.println("Shape is called Interface..");
			}

//			@Override
//			public void food() {
//				System.out.println("food");
//			}
		};
		s.draw();
		
		Shape shape = () -> System.out.println("Right triangle");
		shape.draw();
		          
//		Shape shape1 = () -> System.out.println("food triangle");
//		shape1.food();
	}
}
