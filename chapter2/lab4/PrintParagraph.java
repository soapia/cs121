import java.util.Scanner; // for user input

public class PrintParagraph {
    public static void main(String[] args) {
        String name, college, petname;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        name = scan.nextLine();
        System.out.print("Enter your age here: ");
        age = scan.nextInt();
        // because nextInt(); doesn't consume the rest of the line:
        scan.nextLine();
        System.out.print("Enter your college here: ");
        college = scan.nextLine();
        System.out.print("Enter your pet's name here: ");
        petname = scan.nextLine();
        System.out.println("Hello, my name is " + name + " and I am " + age + " years\nold. I’m enjoying my time at " + college + ", though\nI miss my pet " + petname + " very much!");
    }
}