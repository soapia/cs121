
// PlusTest.java
//
// Demonstrate the different behaviors of the + operator

public class PlusTest {
// -------------------------------------------------
// main prints some expressions using the + operator
// -------------------------------------------------
    public static void main(String[] args) {
        System.out.println("This is a long string that is the " + "concatenation of two shorter strings.");
        System.out.println("The first computer was invented about " + 55 + " years ago."); // changed this to have spaces, saved my eyes
        // below is wrong and prints the sum as 85 because it is simply concatenating 3 strings.
        // to print 13, parentheses are necessary
        // RULE 2 
        System.out.println("8 plus 5 is " + 8 + 5);
        // below is correct and prints the sum as 13 because parentheses were used
        // RULE 3
        System.out.println("8 plus 5 is " + (8 + 5));
        // below is correct and prints the sum as 13; parentheses are not necessary because the first value is
        // an integer and assumes addition instead of concatenation 
        // RULE 1
        System.out.println(8 + 5 + " equals 8 plus 5.");
        // optional but we love some good practice
        System.out.println("Ten robins plus 13 canaries is " + (10 + 13) + " birds.");
    }
}