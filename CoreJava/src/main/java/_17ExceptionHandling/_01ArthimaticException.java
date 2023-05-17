package _17ExceptionHandling;
//Arthimatic
//ArrayOutOfBound
//NullPointer
//NumberFormatException  
public class _01ArthimaticException {

	public static void main(String[] args) {
		  try{  
		      //int data=100/0;  //Arthimatic Exception
			  
		     // int arr[] = {10,20,30};//Array Index bound Of Exception
		     // System.out.println(arr[5]);
		      
			  int a = Integer.parseInt("1a");  //Number Format Exception
		      System.out.println(a);
		      
		      String s1=null;//Null Pointer Exception  
		      System.out.println(s1);
		   }catch(ArithmeticException e){
			  System.out.println(e.getMessage());
			  
		   }catch(NullPointerException s) {  
			   System.out.println(s.getMessage());
			   
		   }catch(ArrayIndexOutOfBoundsException ar) {
			   System.out.println(ar.toString());
			   
		   }catch(NumberFormatException ar) {
			   System.out.println(ar.toString());
		   }
		
		   System.out.println("rest of the code...");  
	}

}
