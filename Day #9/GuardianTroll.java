public class GuardianTroll {
	
	public static void main(String[] args) {
		String name;
		String favColor;
		int favNumber;

		System.out.print("What is your name? ");
		//pause, get input from user, save in name
		name = TextIO.getlnString();

		System.out.print("Favorite number? ");
		favNumber = TextIO.getlnInt();

		//safe numbers are 3 - 7, inclussive
		//throw themo ver the bridge otherwise
		if(favNumber < 3 || favNumber > 7) {
			System.out.println("** " + name + " gets thrown over! **");
			System.exit(0); // end the program
		}

		System.out.print("Favorite color? ");
		favColor = TextIO.getlnString();

		//throw them over if it's "green"

		if(favColor.toLowerCase().equals("green")) { //"GREen" --> "green"
			System.out.println("** " + name + " gets thrown over! **");
			System.exit(0); // end the program
		}

		System.out.println("You may pass!");


	}


}