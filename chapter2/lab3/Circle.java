public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int radius = 10;
        double area = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        
        radius = 20;
        double area2 = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        
        // task one!!!!!!
        System.out.println("As the radius doubled, the area increased by a factor of " + area2 / area);
        
        // optional task!!!!!!
        // 􀀀 Declare a new variable to store the circumference.
        double circumference;
        // 􀀀 Compute the circumference when radius is 10.
        radius = 10;
        circumference = 2 * PI * radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
        // 􀀀 Declare another variable for the second circumference. Compute the circumference again when radius is changed to 20.
        radius = 20;
        double circumference2 = 2 * PI * radius;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
        // 􀀀 Add two additional print statements to print the two circumference respectively.
        // SEE LINES 21 AND 25
        // 􀀀 Find the grew factor for the two circumferences. Print it out. 
        System.out.println("As the radius doubled, the circumference increased by a factor of " + circumference2 / circumference);
    }
}
