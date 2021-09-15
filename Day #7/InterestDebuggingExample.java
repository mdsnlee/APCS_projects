// 3) Change the doubles to ints. Compile and run. What happens? Why? 
// ** Write answer here:It shows error:incompatible types:possible lossy conversation from double to int 
// because the interest rate will generate decimals and int only stores whole number not decimals like doubles do.
//
//
// 4)  Modify the program to output the amount of interest 
// earned and the value of the investment after 3 years
// if the principal starts out at 17000 and the interest is 0.07. 
// (Hint: the answer is not 3570 and 20570--remember that you earn interest on the 
// interest during the 2nd and 3rd years)
// ** Write answer here: The interest is 3825.731 and the principal is 20825.731.

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.027 for one year.  The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */
 
public class InterestDebuggingExample {
   
   public static void main(String[] args) {
   
       /* Declare the variables. */
   
       double principal;     // The value of the investment.
       double rate;          // The annual interest rate.
       double interest;      // Interest earned in the current year.
       double totalInterest; // Total interest earned
       
       /* Do the computations. */
       
       principal = 17000; // Assignment statement
       rate = 0.07; // Assignment statement
       totalInterest = 0;

         // Compute value of investment after one year, with interest.
         // (Note: The new value replaces the old value of principal.)
       
       interest = principal * rate;   // Compute the interest.
       principal = principal + interest;
       totalInterest = interest;  		// First year, total interest is same as initial interest gained    
       System.out.println("***For debugging, erase after fixed***");
       System.out.println("principal after year 1: " + principal);
       System.out.println("interest for year 1: " + interest);
       System.out.println("total interest: " + totalInterest);
       System.out.println();
       
       interest = principal * rate;   // Compute the interest for current year
       principal = principal + interest;
       totalInterest = totalInterest + interest; // new total interest is old total interest plus this year's
       System.out.println("principal after year 2: " + principal);
       System.out.println("interest for year 2 : " + interest);
       System.out.println("total interest year 2: " + totalInterest);
       System.out.println();
       
       interest = principal * rate;   // Compute the interest for current year
       principal = principal + interest;
       totalInterest = totalInterest + interest; // new total interest is old total interest plus this year's
       System.out.println("principal after year 3: " + principal);
       System.out.println("interest for year 3: " + interest);
       System.out.println("total interest year 3: " + totalInterest);
       System.out.println();
       /* Output the results. */
             
       System.out.print("The interest earned is $");
       System.out.println(totalInterest);
       System.out.print("The value of the investment after three year is $");
       System.out.println(principal);
                      
   } // end of main()
      
} // end of class Interest
