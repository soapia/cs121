public class JavaExpressions {
    public static void main(String[] args) {
        int a = 3, b = 10, c = 7;
        double w = 12.9, y = 3.2;
        
        // a. a + b * c = 73
        System.out.println(a + b * c);
        // b. a / b = 0
        System.out.println(a / b);
        // c. b / a = 3
        System.out.println(b / a);
        // d. w / y = 4.03125
        System.out.println(w / y);
        // e. a + w / b = 4.29
        System.out.println(a + w / b);
        // f. a % b = 3
        System.out.println(a % b);
        // g. a % b / y = 0.9375
        System.out.println(a % b / y);
        // h. b % a = 1
        System.out.println(b % a);
        
    }
}