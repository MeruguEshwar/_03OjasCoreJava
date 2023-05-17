package _21MultiThreading;

public class _02Test implements Runnable{
	
	public void run(){
		for(int i=1;i<=5;++i){
			System.out.println("Inside Run Method : "+i);
		}
	}

	public static void main(String[] args) {
		_02Test obj = new _02Test();
		Thread t = new Thread(obj);
		t.start();
		for(int i=6;i<=10;++i){
			System.out.println("Inside Main Method : "+i);
		}

	}
}
