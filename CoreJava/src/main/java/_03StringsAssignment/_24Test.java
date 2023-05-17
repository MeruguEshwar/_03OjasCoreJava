package _03StringsAssignment;

public class _24Test {

	public static void main(String[] args) {
		String s1 = "javadeveloper";
		String s2 = "";
		
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch= s1.charAt(i);
			if(s2.indexOf(ch) == -1)
			{
				s2+=ch;
				System.out.println(s2);
			}
		}
		//System.out.println(s1);
		System.out.println(s2);
	}

}
