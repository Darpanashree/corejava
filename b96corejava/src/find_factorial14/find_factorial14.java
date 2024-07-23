package find_factorial14;
import java.util.Scanner;


public class find_factorial14 {
	 public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in); // create a scanner object
	        System.out.println("Enter a number to find factorial:");
	        int num = scan.nextInt(); // get input from user
	        
	        // Lambda expression for factorial calculation
	        Factorial factorial = (n) -> {
	            int f = 1;
	            for (int i = 1; i <= n; i++) {
	                f *= i;
	            }
	            return f;
	        };
	        
	        // Call the lambda expression and print the result
	        System.out.println("Factorial of " + num + " is " + factorial.calculate(num));
	    }

	    @FunctionalInterface
	    interface Factorial {
	        int calculate(int n);
	    }
	}


