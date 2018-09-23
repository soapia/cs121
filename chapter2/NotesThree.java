import java.util.Scanner; // for user input

public class NotesThree {
    public static void main(String[] args) {
        
        // CONVERTING DATA TYPES //
        
        /* so essentially you can either perform a widening conversion (like an 
           int to a float) of a narrowing conversions (which should be avoided, as it loses info) */
        // conversion types are ASSIGNMENT, PROMOTION, AND CASTING
        // ASSIGNMENT: (only widening conversions can occur this way)
        int dollars = 20;
        double money = dollars;
        // PROMOTION: 
        int count = 12;
        double sum = 490.27;
        double result = sum / count; // surprise sum!! ya got ~promoted~
        // CASTING: (powerful && dangerous)
        int total = 50;
        float answer = (float) total / 6;
        
        
        // INTERACTIVE PROGRAMS //
        // so lets break down the whole scanner thing..........
        Scanner scnr = new Scanner(System.in); // creates a new instance of the scanner class with a parameter of System.in
        // there's quite a few ways to get data from our scnr
        System.out.print("Enter a number: ");
        int number = scnr.nextInt();
        System.out.print("Enter a decimal: ");
        double decimal = scnr.nextDouble();
        System.out.print("Enter a message: ");
        String message = scnr.nextLine();
        // and so on...
        // if the data type isn't specified like so:
        System.out.print("Enter some words: ");
        String words = scnr.next();
        // the scnr parses through the string based on a ~delimiter~ of " " and pulls out only the word with an index of 0
        System.out.println("Your number is " + number + "." + "\nYour decimal is " 
        + decimal + "." + "\nYour message is " + message + "." + "Your first word is " + words + ".");
        // IT IS IMPORTANT TO CLOOOOOSE YOUR SCANNER!
        scnr.close();
    }
}