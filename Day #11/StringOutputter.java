public class StringOutputter {

/**
* The main subroutine is already written for you this time.  
* It calls the subroutine returnTwo.
*
* The output for the main subroutine should be:
* bo, h!, hy, ya, at, at, a@, @a, @@, @@ 
*/
	public static void main(String[] args) {		
		System.out.print(returnTwo("booyahhh!", true) + ", ");
		System.out.print(returnTwo("booyahhh!", false) + ", ");
		
		System.out.print(returnTwo("hya", true) + ", ");
		System.out.print(returnTwo("hya", false) + ", ");
	
		System.out.print(returnTwo("at", true) + ", ");
		System.out.print(returnTwo("at", false) + ", ");
		
		System.out.print(returnTwo("a", true) + ", ");
		System.out.print(returnTwo("a", false) + ", ");
		
		System.out.print(returnTwo("", true) + ", ");
		System.out.println(returnTwo("", false));
		
	}

/**
* This function, given a string, returns a String length 2 from its front, 
* unless wantFront is false, in which case return a String length 2 from its back. 
* If the String is insufficient in length, replace any missing characters 
* with the '@' character.  
* 
* @param myString the String to be checked
* @param wantFront a boolean indicating whether to grab from the front or back of the String
* @return a String as outlined above 
**/
	public static String returnTwo(String myString, boolean wantFront) {
		if (myString.length() == 0) {
			return "@@";
		}
		else if (myString.length() == 1) {
			if (wantFront) {
				return myString + "@";
			}

			return "@" + myString;
		}
		else if(wantFront) {
			return myString.substring(0,2);
		}

		return myString.substring(myString.length()-2, myString.length());

















	}
}
