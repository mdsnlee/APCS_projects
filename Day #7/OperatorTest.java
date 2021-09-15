public class OperatorTest {
		// test different data types 
	public static void main(String[] args) {
		byte test = 100;
		System.out.println(test); 
		test = (byte)(test+20);  
		System.out.println(test); 
		test = (byte)(test+20);
		System.out.println(test); 
		
		// do some arithmetic
		String n1 = "Turing";					// Assign String literal "Turing" to n1
		n1 = n1.toUpperCase();			// just calling n1.toUpperCase() doesn't change it permanently
		System.out.println(n1); 	// print out n1 as uppercase
		System.out.println(n1.length()); 		// print out n1's length
		System.out.println(n1.substring(1, 4)); 		// print out just a substring from 1 to 3 of n1

	
		// Test concatenation and assignment statements
		int a = 12;
		int b = 8;
		int c = 6;
			
		System.out.println(a + " " + b + " " + c + " "); // Here, a = 12, b = 8, c = 6
		a = c;
		System.out.println(a + " " + b + " " + c + " "); // Here, a = 6, b = 8, c = 6
		c = c + b;
		System.out.println(a + " " + b + " " + c + " "); // Here, a = 6, b = 8, c = 14 
		a = b + c;
		System.out.println(a + " " + b + " " + c + " "); // Here, a = 22, b = 8, c = 14
		
		//unary operators
		// a++ "postfix": check first, then increment afterwards
		// ++a "prefix": increment first, then check afterward
		// usually doesn't matter, BE CAREFUL when using as part of expression
		if(++a > 22) {
			System.out.println("a is bigger than 22!");
		}
		else {
			System.out.println("a is less than or equal than 22!");
		}

		
		//what's wrong with this? what's going on here?
		double quotient;
		double x = 6;
		double y = 10;
		quotient = x / y; 
		System.out.println(quotient); 
		// let's try again! Note that the type conversion operator has higher
		//precedence than division. 
		
		//typecast: force the int to behave as a double
		System.out.println((double)x/y);
		
		
		
		// You can perform multiple boolean checks in one statement using 
		// "and" && or the "or" || operators
		boolean myBool = true;
		if(true || myBool && false)
			System.out.println("True!!!");
		else 
			System.out.println("False!!!");
		
		// Call subroutines defined below...remember they don't run unless
		// we call them!
		
		sayHi();
		saySup();

		
	}
	
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	public static void saySup() {
		System.out.println("Sup");
	}

}