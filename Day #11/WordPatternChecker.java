// **** Enter your name:
			// ** Don't rename class name, leave as WordPatternChecker
public class WordPatternChecker {
/**
 * The main subroutine should welcome the user and then prompt the user for a word 
 * using TextIO.getlnWord().TextIO.getlnWord() should be used ONCE in the whole file.
 *
 * Next, the main subroutine should use the checkWordForPattern subroutine to check 
 * whether the word follows the pattern described below:
 * 1) The word length is EVEN and the word is composed of the same string twice
 *    Examples: "byebye", "himhim", "shopshop", "oo", "hihi", "", "tromttromt"
 * OR
 * 2) The word length is ODD and the word is composed of the same string twice with
 *    a single letter between them
 *    Examples: "byexbye", "shopashop", "aya", "ooloo", "y", "tromtttromt"
 *
 * If the word follows the pattern, main() should print out the following message:
 * "The word <word> follows the pattern!"
 * If the word doesn't follow the pattern, the program should print out:
 * "The word <word> does not follow the pattern."
 *
 * The subroutine checkWordForPattern must be called from the main subroutine.
 * All of the interaction with the user should be done in the most user friendly way
 * possible. Test your program when it's done. Make sure that it works and that it
 * is easy for someone to use.
 */
	public static void main(String[] args) {
		System.out.print("Hello! Please input a word: ");
		String input = TextIO.getlnWord();

		if(checkWordForPattern(input)) {
			System.out.println("The word " + input + " follows the pattern!");
		}
		else {
			System.out.println("The word " + input + " does not follow the pattern.");
		}	
	}
	

	
/**
 * This subroutine checks whether a word follows the pattern described below:
 * 1) The word length is EVEN and the word is composed of the same string twice
 *    Examples: "byebye", "himhim", "shopshop", "oo", "hihi", "", "tromttromt"
 * OR
 * 2) The word length is ODD and the word is composed of the same string twice with a
 *    single letter between them
 *    Examples: "byexbye", "heraher", "shopashop", "aya", "ooloo", "y", "tromtttromt"
 * If the word follows the pattern, this subroutine returns true. Otherwise, it 			
 * should return false. This subroutine should NOT print out anything! 
 * @param word the string that will be checked for the pattern
 * @return true if the pattern is present or false otherwise
 */
	public static boolean checkWordForPattern(String word) {
		if (word.length() < 2) {
			return true;
		}

		if (word.length() % 2 == 0) {
			if (word.substring(0, word.length()/2).equals(word.substring(word.length()/2))) {
				return true;
			}
		}

		if (word.substring(0, word.length()/2).equals(word.substring(word.length()/2 +1))) {
			return true;
		}

		return false;
	}
}