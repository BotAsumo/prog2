package prog2;
import java.util.Scanner;
public class uppgift2 {	
	 public static void main(String[] args) {
		 
		 String str;
	        Scanner input = new Scanner(System.in);// 
	        System.out.print("skriv något: ");
	        str = input.nextLine();
		 
	        String reversed = reverseString(str);
	       
	        System.out.println("The reversed string is: " + reversed);
	        
	    }

	    public static String reverseString(String str)
	    {
	        
	        //rekursiv
	    	return reverseString(str.substring(1)) + str.charAt(0);
	    }
	}