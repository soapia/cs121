import java.util.Scanner; // for user input

public class StringPlay {
    public static void main (String[] args) {
        String college = new String ("Princeton University");
        
        // part (a), fill in your code here
        String town = new String("Princeton, NJ, USA");
        
        int stringLength;
        String change1, change2, change3, change4, change5;
        
        // part (b), fill in your code here
        stringLength = college.length();
        
        System.out.println(college + " contains " + stringLength + " characters.");
        
        // part (c), fill in your code here
        change1 = college.substring(0, 3);
        
        // part (d), fill in your code here
        change2 = college.substring(10, 20);
        
        // part (e), fill in your code here
        change3 = college.toUpperCase();
        
        // part (f), fill in your code here
        change4 = change3.replace('O','*');
        
        // part (g), fill in your code here
        change5 = college + town;
        
        // fill in your code here to print out each changed string. 
        System.out.println(change1);
        System.out.println(change2);
        System.out.println(change3);
        System.out.println(change4);
        System.out.println(change5);
        
        // let's get ~interactive~
        System.out.println("\n That was just for Princeton University.\n Where do you go to college?");
        Scanner scan = new Scanner(System.in);
        college = scan.nextLine();
        System.out.println(" And where is your college located?");
        town = scan.nextLine();
        System.out.println("Cool! You're going to " + college + " in " + town + "!!");
    }
}
