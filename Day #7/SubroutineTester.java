
public class SubroutineTester {

	public static void main(String[] args) {
		// Be sure to add your own test cases.  Make sure it works for ANY possible inputs,
		// NOT just the 3 examples.  Use variables, not hardcoded solutions!
		
		System.out.println("***Testing (1) sleepIn***");
		System.out.println("Calling sleepIn(false, false) -->  " + sleepIn(false, false) + ". (Should be true)");
		System.out.println("Calling sleepIn(true, false) -->  " + sleepIn(true, false) + ". (Should be false)");
		System.out.println("Calling sleepIn(false, true) -->  " + sleepIn(false, true) + ". (Should be true)");
		//System.out.println("Calling sleepIn(, ) -->  " + sleepIn(, ) + ". (Should be )");

		System.out.println("\n***Testing (2) monkeyTrouble***");
		System.out.println("Calling monkeyTrouble(true, true) -->  " + monkeyTrouble(true, true) + ". (Should be true)");
		System.out.println("Calling monkeyTrouble(false, false) -->  " + monkeyTrouble(false, false) + ". (Should be true)");
		System.out.println("Calling monkeyTrouble(false, true) -->  " + monkeyTrouble(false, true) + ". (Should be false)");
		//System.out.println("Calling monkeyTrouble(, ) -->  " + monkeyTrouble(, ) + ". (Should be )");

		System.out.println("\n***Testing (3) sumDouble***");
		System.out.println("Calling sumDouble(1, 2) -->  " + sumDouble(1, 2) + ". (Should be 3)");
		System.out.println("Calling sumDouble(3, 2) -->  " + sumDouble(3, 2) + ". (Should be 5)");
		System.out.println("Calling sumDouble(2, 2) -->  " + sumDouble(2, 2) + ". (Should be 8)");
		// System.out.println("Calling sumDouble( ,  ) -->  " + sumDouble(, ) + ". (Should be )");

		
		System.out.println("\n***Testing (4) diff21***");
		System.out.println("Calling diff21(19) -->  " + diff21(19) + ". (Should be 2)");
		System.out.println("Calling diff21(10) -->  " + diff21(10) + ". (Should be 11)");
		System.out.println("Calling diff21(30) -->  " + diff21(30) + ". (Should be 18)");
		//System.out.println("Calling diff21( ) -->  " + diff21( ) + ". (Should be   )");

		
		System.out.println("\n***Testing (5) parrotTrouble***");
		System.out.println("Calling parrotTrouble(true, 6) -->  " + parrotTrouble(true, 6) + ". (Should be true)");
		System.out.println("Calling parrotTrouble(true, 7) -->  " + parrotTrouble(true, 7) + ". (Should be false)");
		System.out.println("Calling parrotTrouble(false, 6) -->  " + parrotTrouble(false, 6) + ". (Should be false)");
		// System.out.println("Calling parrotTrouble(  ,  ) -->  " + parrotTrouble(,  ) + ". (Should be  )");

	}
	
	// These subroutines, or functions, can be "called" by main() 
	// as many times as you want (or not at all). They DO NOT RUN on their own.
	
	// They should perform some kind of "task" useful to main (or whoever calls them).
	// They can take in parameters essential to the task. 
	// Like in math, f(x) notation means x is passed in as a parameter.
	
	// Then, the subroutine "returns" the result of it's work.
	// The return type (int, String, double, boolean, void -- for nothing) indicates
	// what kind of value must be returned back to the calling method -- main() in this case.
	
	/* (1) sleepIn - We are writing a function (subroutine) that, given the status of weekday/weekend 
	 * and vacation/not on vacation, tells us whether we will sleep in or not.
	 * 
	 * Description of task: The parameter weekday is true if it is a weekday, 
	 * and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. 
	 * Return true if we sleep in.
	 * 
	 * Example: since weekday == false, and vacation == false, that means it's a weekend, and I'm 
	 * not on vacation, so I DO sleep in.
	 * sleepIn(false, false) → true
	 * 
	 * Example: since weekday == true, and vacation == false, that means it's a weekday, and I'm
	 * not on vacation.  I DON'T sleep in.
	 * sleepIn(true, false) → false
	 * 
	 * Example: since weekday == false, it's a weekend and since vacation == true, I'm on vacation.
	 * I DO sleep in.  
	 * sleepIn(false, true) → true
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		// You want to write a general function that returns the correct value (true/false)
		// for ANY possible input (not just the ones listed above).  You can test your code
		// by walking through your code, pretending you are the computer, and seeing if it 
		// will indeed output the correct value for a given set of input parameters.
		
		if (weekday == false || vacation == true) {
    		return true;
  		}
  
  		return false;
	}
	
	/* (2) monkeyTrouble - We are writing a function (subroutine) that, given the the boolean status of 
	 * whether 2 monkeys are smiling, tells us if we are in trouble. 
	 * 
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
	 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
	 * 
	 * Example: since monkey a is smiling and monkey b is smiling, then YES, I'm in trouble 
	 * monkeyTrouble(true, true) → true
	 * 
	 * Example: since neither monkey a or b is smiling, the YES, I'm in trouble
	 * monkeyTrouble(false, false) → true
	 * 
	 * Example: since only monkey a is smiling, then NO I'm not in trouble 
	 * monkeyTrouble(true, false) → false
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == bSmile) {
			return true;
		}
		
		return false;
	}
	
	/* (3) sumDouble - 
	 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 * 
	 * Example: since a (1) and b (2) are NOT the same, return the sum of 1 and 2.   
	 * sumDouble(1, 2) → 3
	 * 
	 * Example: since a (3) and b (2) are NOT the same, return the sum of 3 and 2.
	 * sumDouble(3, 2) → 5
	 * 
	 * Example: since a (2) and b (2) ARE the same, return the twice the sum of 2 + 2.
	 * sumDouble(2, 2) → 8
	 */
	public static int sumDouble(int a, int b) {
		if (a != b) {
			return a + b;
		}
		
		return (2 * (a + b));
	}
	
	/* (4) diff21 - 
	 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	 * 
	 * Example: since n (19) is less than 21, return 21 - 19   
	 * diff21(19) → 2
	 * 
	 * Example: since n (10) is less than 21, return 21 - 10
	 * diff21(10) → 11
	 * 
	 * Example: since n (30) is over 21, return twice 30 - 21 
	 * diff21(30) → 18
	 */
	public static int diff21(int n) {
		if (n > 21) {
    		return 2*(n - 21);
  		}
  		return 21 - n;
	}
	
	
	/* (5) parrotTrouble - We are writing a function (subroutine) that, given the the boolean status of 
	 * whether the parrot is talking, and the int value of what hour it is in the day, tells us if we are in trouble
	 * (with our neighbors, presumably).  
	 * 
	 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
	 * 
	 * Example: since the parrot IS talking, and it's 6 in the morning, then YES, I'm in trouble 
	 * parrotTrouble(true, 6) → true
	 * 
	 * Example: since the parrot is talking, BUT it's 7 o clock, then NO, I'm not in trouble
	 * parrotTrouble(true, 7) → false
	 * 
	 * Example: since the parrot is NOT talking, even though it's 6 in the morning, then NO I'm not in trouble.
	 * parrotTrouble(false, 6) → false
	 */
	public static boolean parrotTrouble(boolean talking, int hour) {
		// Again, you want to write a general function that returns the correct value (true/false)
		// for ANY possible input (not just the ones listed above).  Does it work for hour == 21?
		// Does it work if the parrot is talking and it's noon?  
		
		if (talking == false) {
			return false;
		}
		
		if (hour < 7 || hour > 20 && talking == true) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	

	
	
}
