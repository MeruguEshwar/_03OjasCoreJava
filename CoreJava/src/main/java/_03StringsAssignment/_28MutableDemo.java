package _03StringsAssignment;

public class _28MutableDemo {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Eshwar");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str.append("Nani");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str.reverse());
	}
}
