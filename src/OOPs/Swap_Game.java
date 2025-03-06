package OOPs;

public class Swap_Game{

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "Nikhil";

        Person p2 = new Person();
        p2.age = 19;
        p2.name = "Prashant";

        p1.SayHi();
        p2.SayHi();

        swap(p1, p2);

        p1.SayHi();
        p2.SayHi();
    }

    public static void swap(Person psn1, Person psn2) {
       Person temp = psn1;
       psn1 = psn2;
       psn2 = temp;
    }
}

class Person {
    int age;
    String name;

    void SayHi() {
        System.out.println(name + "[" + age + "] says Hi!");
    }
}
