package gitdemo;

public class gitclass 
{

	 public static void main(String args[]) {  
	        String a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        System.out.println("a+b  "+a);
	        System.out.println("length of a =  "+a.length());
	        b = a.substring(0, a.length() - b.length());  
	        System.out.println("swapping operation  "+b);
	        a = a.substring(b.length());  
	        System.out.println("final  "+a);
	        System.out.println("After : " + a + " " + b);  
	    } 
}
