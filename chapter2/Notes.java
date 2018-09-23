public class Notes {
    public static void main(String[] args) {
        int age = 17;
        System.out.println("i am " + age + " years old"); 
        // JAVA DOESN'T HAVE STRING INTERPOLATION because it fuckin SUCKS
        // concatenation is the only option
        // very sad
        
        // anyways lets go over some ESCAPE SEQUENCES...
        // if you want a backspace... its \b
        System.out.println("hi im sofia\ba"); 
        // if you want a tab... its \t
        System.out.println("i \t love \t TABS");
        // if you want a new line... its \n
        System.out.println("1\n2\n3\n4\n5");
        // if you want quotes... its \"
        System.out.println("i said \"hi\" to you...");
        // and if you want a slash... its \\
        System.out.println("if you want to interpolate in swift, \nyou write \\() and put text in the parentheses");
        
        // now let's talk about VARIABLES!
        // you can define multiple at a time:
        int age, grade, number;
        // you can also assign values in declaration:
        int age = 17, grade = 13, number = 21;
        // and you can simply redefine like so:
        age = 18;
        // constants are a *wee* bit different...
        // you have to declare them in ALL CAPS BC WOW ITS SO EXCITING and then say final at the beginning
        final int BIRTHDAY = 21;
        // miss birthday won't be changing any time soon :)
        
    }
}