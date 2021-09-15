// 3) Change the doubles to ints. Compile and run. What happens? Why? 
// ** Write answer here:
//
//Unless you change the rate, it will error out. Since 0.027 is not an int,
//but instead a double, and since ints and doubles are different, they'll error out.
//There is no way around this because interest isn't, or normally isn't, over 100%/1.
//
//
// 4)  Modify the program to output the amount of interest 
// earned and the value of the investment after 3 years
// if the principal starts out at 17000 and the interest is 0.07. 
// (Hint: the answer is not 3570 and 20570--remember that you earn interest on the 
// interest during the 2nd and 3rd years)
// ** Write answer here: 

// 17000 * 1.07 * 1.07 * 1.07 = 20825.731 with interest $1362.431

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on $17,000 invested at an interest
 * rate of 0.027 for one year.  The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */
 
public class Interest {
   
   public static void main(String[] args) {
   
       /* Declare the variables. */
   
       double principal;     // The value of the investment.
       double initialPrincipal;
       
       double rate;          // The annual interest rate.
       double interest;      // Interest earned in one year.
       
       /* Do the computations. */
       
       principal = 17000; // Assignment statement
       initialPrincipal = 17000;
       rate = 0.07; // Assignment statement
       interest = principal * rate;   // Compute the interest.
       
       principal = principal + interest;
       
       interest = principal * rate;
       principal = principal + interest;
       
       interest = principal * rate;
       principal = principal + interest;

        interest = principal - initialPrincipal;
             // Compute value of investment after one year, with interest.
             // (Note: The new value replaces the old value of principal.)
             
       /* Output the results. */
             
       System.out.print("The interest earned is $");
       System.out.println(interest);
       System.out.print("The value of the investment after one year is $");
       System.out.println(principal);
                      
   } // end of main()
      
} // end of class Interest
