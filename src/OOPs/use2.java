package OOPs;

// PassThisDemo.java
// Yeh class dikhati hai ki kaise "this" ka use karke current object ko dusre method/constructor mein argument ke roop mein bheja jata hai.

public class use2 {
    public static void main(String[] args) {
        Person0 p1 = new Person0("Sneha", 22);

        Printer printer = new Printer();
        // Yahan p1 object ko "this" ke through method mein pass kiya gaya hai
        printer.printPerson(p1);

        // Alternatively, Person class ke method se bhi current object pass kar sakte hain.
        p1.passMyself();
    }
}

class Person0 {
    String name;
    int age;

    Person0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to pass current object using "this"
    void passMyself() {
        Printer printer = new Printer();
        printer.printPerson(this); // "this" se current object pass ho raha hai
    }
}

class Printer {
    void printPerson(Person0 p) {
        System.out.println("Printer printing: " + p.name + " [" + p.age + "]");
    }
}
