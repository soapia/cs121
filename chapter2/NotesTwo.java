public class NotesTwo {
    public static void main(String[] args) {
        // there are actually a few diff types of numbers in java! 
        // byte (-127, 128) short (-32k, 32k) int (-2b, 2b) long (-bigg, bigg)
        // we mainly use int and long, though
        byte littlestNumber = 100; 
        short littleNumber = 13498;
        int bigNumber = 1221404360;
        long biggestNumber = 205862048;
        // and let's not forget our decimals! float or double!
        // float decimal = 124.2; idk why this chick ain't working
        double biggerDecimal = 1412085.230583109;
        
        // characters!! like strings but just a character... bc they're stored as numbers... see: konami code lab
        // there's 65k characters out there!!!!
        char interestingLetter = 'k'; // we use single quotes bc this bih aint a string
        char thatNegativeThing = '¬';
        
        // we luv 2 boooool (t, f, null)
        boolean condition = true;
        
        // pemdas... she exists...
        
        // incrementing is kinda like homegirl js
        int number = 5;
        number++; // will add one
        number -= 2; // will subtract 2
        number *= 3; // will multiply 3
        number /= 4; // will divide by 4 // THE FACT THIS / SYMBOL WON'T HIGHLIGHT PINK DRIVES ME THROUGH THE WALLLLL
        System.out.print(number);
        
        // WOAHHHHH DIDN'T KNOW THIS,, YOU CAN INCREMENT WITH LIKE CONCATENATIONS
        String phrase = "hello";
        phrase += "!";
        System.out.print(phrase);

    }
}