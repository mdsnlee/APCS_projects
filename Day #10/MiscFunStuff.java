public class MiscFunStuff {

	public static void main(String[] args) {
		System.out.println("Welcome! Enter your choice.");
		System.out.print("(1) Convert in. to cm. (2) Even or Odd  (3) Advice: ");
		int choice;
		//pause, get input as int, save in choice
		choice = TextIO.getlnInt();
		if(choice == 1) {
			convert();
		}
		else if(choice == 2) {
			evenOdd();
		}
		else if (choice == 3) {
			randAdvice();
		}
		else {
			System.out.println("enter 1, 2, or 3. so goofy");
		}
	}
	
	public static void convert() {
		System.out.print("Enter your height in inches: ");
		double heightInInches = TextIO.getlnDouble();
		System.out.println("Your height in cm is " + inchesToCm(heightInInches));
	}
	
	public static double inchesToCm(double inches) {
		return inches * 2.54;
	}
	
	public static void evenOdd() {
		System.out.print("Give me an integer: ");
		int number = TextIO.getlnInt();
		if(number % 2 == 0) 
			System.out.println("It's even!");
		else if(number % 2 == 1)
			System.out.println("It's odd!");
		else
			System.out.println("It's neither...enter an integer!");
	}
	
	public static void randAdvice() { // practice debugging with System.out!
		int rand = (int)(Math.random()*3+1); // ** generate a rand int from 1 to 3
		//System.out.println(rand);
		String advice = ""; 
  
		if(rand == 1)  
			advice = "try harder";
		else if(rand == 2)
			advice = "keep going!";	
		else if(rand == 3)
			advice = "deep breaths";	

		System.out.println(advice);		
	}
}

	