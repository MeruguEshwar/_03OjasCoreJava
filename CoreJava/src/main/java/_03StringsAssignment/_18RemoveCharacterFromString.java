package _03StringsAssignment;

public class _18RemoveCharacterFromString {

	public static void main(String[] args) {
		  StringBuilder MyString = new StringBuilder("Hello World");
	       System.out.println("The string before removing character: " + MyString);
	       MyString = MyString.deleteCharAt(4);
	       System.out.println("The string after removing character: " + MyString);
	}

}
