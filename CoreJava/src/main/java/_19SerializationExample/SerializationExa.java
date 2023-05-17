package _19SerializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{

	public int sid;
	public String sname;
	public int marks;
	
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
}

class SerializationDemo{
	public void Serialization(Object obj) {
		try {
			FileOutputStream fos = new FileOutputStream("nani.txt");
			ObjectOutputStream ops = new ObjectOutputStream(fos);
			ops.writeObject(obj);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Serialization Completed.....");
	}
}

class DeserializationDemo{
	public void DeSerialization() {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream("nani.txt");
			ObjectInputStream ops = new ObjectInputStream(fis);
			try {
				obj = ops.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("DeSerialization Completed.....");
	}
}

public class SerializationExa {
	public static void main(String[] args) {
		SerializationDemo sz = new SerializationDemo();
		Student s1 = new Student(1,"eshwar",90);
		sz.Serialization(s1);
		
		DeserializationDemo dsd = new DeserializationDemo();
		Student s2 = new Student(2,"Nani",80);
		dsd.DeSerialization();
	}
}
