package _16CloneMethod;

public class CloneTest implements Cloneable{
	int a = 10;
	int b = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneTest t = new CloneTest();
		System.out.println("A value is:"+t.a);
		System.out.println("B value is:"+t.b);
		
		CloneTest t1 = (CloneTest) t.clone();
		System.out.println("After Convertion to clone Obj a is:"+t1.a);
		System.out.println("After Convertion to clone Obj b is:"+t1.b);
		
		t1.a=100;
		t1.b=200;
		
		System.out.println(t.a+" "+t.b);
		System.out.println(t1.a+" "+t1.b);
		
		System.out.println(t.getClass());
		System.out.println(t.getClass().getName());
	}

}
