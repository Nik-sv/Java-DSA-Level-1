//// PersonDemo.java
//// Yeh class dikhati hai ki kaise "this" ka use karke
//// instance variables aur parameters mein name conflict resolve hota hai
//// aur constructor chaining se default constructor parameterized constructor ko call karta hai.
//package OOPs;
//
//public class This_Keyword_use1 {
//    public static void main(String[] args) {
//        // Parameterized constructor se object create karte hain
//        PersonN p1 = new PersonN("Rahul", 25);
//        p1.showDetails(); // Expected Output: Person: Rahul [25]
//
//        // Default constructor call karta hai parameterized constructor using this()
//        PersonN p2 = new PersonN();
//        p2.showDetails(); // Expected Output: Person: Default Name [0]
//    }
//}
//
//class PersonN {
//    String name;
//    int age;
//
//    // Default Constructor - Constructor chaining using "this()"
//    PersonN() {
//        this("Default Name", 0);
//    }
//
//    // Parameterized Constructor - Using "this" for name conflict resolution
//    PersonN(String name, int age) {
//        this.name = name; // "this.name" refers to the instance variable
//        this.age = age;   // "this.age" refers to the instance variable
//    }
//
//    void showDetails() {
//        System.out.println("Person: " + this.name + " [" + this.age + "]");
//    }
//}


























package OOPs;

public class This_Keyword_use1 {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        PersonN p1 = new PersonN("Rahul", 25);
        p1.showDetails(); // Expected Output: Person: Rahul [25]

        // Creating an object using the default constructor,
        // which calls the parameterized constructor using "this()"
        PersonN p2 = new PersonN();
        p2.showDetails(); // Expected Output: Person: Default Name [0]
    }
}

class PersonN {
    String name;
    int age;

    // Default Constructor - Using constructor chaining to call the parameterized constructor
    PersonN() {
        this("Default Name", 0);
    }

    // Parameterized Constructor - "this" is used to resolve name conflicts
    PersonN(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }

    // Method to display the details of the Person
    void showDetails() {
        System.out.println("Person: " + this.name + " [" + this.age + "]");
    }
}

