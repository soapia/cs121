public class Notes {
    public static void main(String[] args) {
        String name = "a cool name";
        // because String is a class, we can create an instance of that class:
        String title = new String("my new and improved name!");
        // the big DIFF here is that you cannot change the length or value of our instanciation because its immutable, 
        // and that the latter is a object instance rather than *just* a string
        // think like the first is a variable and the second is a reference, with an address and alllllll
        // so hypothetically, if we were to set:
        name = title;
        // name and title would then have the saaaaaame reference! so they're aliases of each other!
        // although, if we were to do smth like this:
        String title2 = new String("my new and improved name!");
        // and then compare the two:
        System.out.println(title == title2);
        // FALSE would be returned. they ain't the same bc their references ain't the same
        // if they were string literals it would be true, so we prefer to use them :)
        // and we can invoke methods upon that instance:
        System.out.println(title.length());
        // ANYWAYS 
        // let's go over summmmmmmm
        
        // STRING METHODS //
        String greeting = "hey what's up hello world";
        System.out.println(greeting);
        greeting = greeting.concat(", how's it hangin?");
        System.out.println(greeting);
        greeting = greeting.toUpperCase();
        System.out.println(greeting);
        greeting = greeting.replace('H', 'B');
        System.out.println(greeting);
        greeting = greeting.substring(3, 30);
        System.out.println(greeting);
    }
}