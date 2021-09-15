public class RandomStuff {

	public static void main(String[] args) {
	
		// demo of 2.5 stuff
		System.out.println(Integer.MAX_VALUE);  //output maximum int value
		System.out.println(Math.PI);
		System.out.println((int)Math.PI); //typecasting double to int
		int x = 68;
		System.out.println((char)x); //**typecasting int to char
		
		//Type conversion between String and other types CANNOT
		// BE DONE WITH TYPECASTS. One way to convert a value 
		// of any type TO a string is to concatenate it with an empty string. 
		String num = 42 + ""; //OK, converted to String
		
		// Another way is the function String.valueOf(x), 
		// a static member function in the String class.
		String num2 = String.valueOf(42);
		System.out.println(num + num2); //Should be "4242" not 84
		
		// To convert FROM a String to an int (or double), we can use
		// the static member function parseInt() or parseDouble() 
		String str = "12345";
		String str2 = "3.14159";
		int a = Integer.parseInt(str);  //** change to set a to be the int value of str
		double b = Double.parseDouble(str2); //** change to set b to be the double value of str2
		// notice how we can do arithmetic on a and b now (not concatenation)
		System.out.println(a + 1); //should be 12345 + 123461
		System.out.println(b + 1.5); //3.14159 + 1.5
		
		// rand double 0 - 1 exclusive on the 1
		double rand = Math.random();
		double rand2 = Math.random();
		
		System.out.println("Random Numbers!: " + rand + ", " + rand2);									
		
		// **another way to write rand = rand + 5;
		rand += 5;
		
		// another way to write rand2 = rand2 / 10;
		rand2 /= 10;
	
		System.out.println("Random Numbers!: " + rand + ", " + rand2);
		
		// short-circuit evaluation demo:
		x = 0;
		int y = 8;
		if((x != 0) && (y/x > 1))
			System.out.println("y/x is greater than 1");
		else
			System.out.println("Sorry, either x was 0 or y/x was not greater than 1");
	
		// mod operator - think of what the remainder would be when dividing by
		// that number
		System.out.println("10 % 2 is " + 10 % 2); //
		System.out.println("10 % 3 is " + 10 % 3); //
		System.out.println("10 % 4 is " + 10 % 4); //
		System.out.println("10 % 5 is " + 10 % 5); //
		
		
	
	}

}