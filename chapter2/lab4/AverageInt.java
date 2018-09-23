import java.util.Scanner; // for user input

public class AverageInt {
    public static void main(String[] args) {
        int first, second, third;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first integer here: ");
        first = scan.nextInt();
        System.out.print("Enter your second integer here: ");
        second = scan.nextInt();
        System.out.print("Enter your third integer here: ");
        third = scan.nextInt();
        scan.close();
        double average = ((double) (first + second + third)) / 3.0;
        System.out.println("Your average is " +  average);
    }
}