import java.util.Scanner; // for user input

public class Salary {
    public static void main(String[] args) {
        System.out.println("What is your wage?"); // REMEMBER YOUR SEMICOLONS DAMMIT
        int wage; // defining a variable that is of the data type Integer
        // SO basically with scanner you use the funky syntax below to get ready to take in uper input
        Scanner scnr = new Scanner(System.in); // hence system in instead of system out
        wage = scnr.nextInt() * 40 * 50; // call upon scnr to get the Integer inputted stored as wage
        System.out.print("Salary is " + wage); // print on line // CONCATENATION EXISTS YAYAYA
        // System.out.println(wage); // print on line, start NEW line
    } 
}

// SO COOL OMG YOU MADE A USER INPUT PROGRAM WE LOVE THIS SONG
