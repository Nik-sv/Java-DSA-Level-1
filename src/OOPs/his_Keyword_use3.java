package OOPs;

public class his_Keyword_use3 {

    public static void main(String[] args) {
        // Creating Person objects using the inner static class
        Person c = new Person();
        c.age = 10;
        c.name = "Nikhil";
        c.saysHi(); // Method name should match the defined method

        Person c2 = new Person(19, "Prashant");
        c2.saysHi();
    }

    // Making the Person class static so it can be instantiated in the static main method
    static class Person {
        int age;
        String name;

        // Default Constructor
        Person() {
            // Optional: Initialization code can be added here if needed
        }

        // Parameterized Constructor using "this" keyword to resolve name conflicts
        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Method to display details using the "this" keyword implicitly
        void saysHi() {
            System.out.println(this.name + " [" + this.age + "] says Hi!");
        }
    }
}
