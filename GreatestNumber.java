package labtest;

public class GreatestNumbers {

	public static void main(String[] args) {
		GreatestNumbers();

	}
	public static void GreatestNumbers() {
	        double n1 = 10, n2 = 20, n3 = 30;//defined inputs.

	        if(n1 >= n2) {  //condition to check for Largest Number between n1 and n2.
	            if(n1 >= n3) //condition to check for Largest Number between n1 and n3.
	                System.out.println(n1 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        } else {
	            if(n2 >= n3)//condition to check for Largest Number between n2 and n3.
	                System.out.println(n2 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        }
	    }

}
