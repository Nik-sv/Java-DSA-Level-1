package OOPs;

public class Swap_Game_3 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.age = 21;
        p1.name = "Nikhil";

        Person2 p2 = new Person2();
        p2.age = 19;
        p2.name = "Prashant";

        p1.SayHi();
        p2.SayHi();

        swap(p1, p2);

        p1.SayHi();
        p2.SayHi();
    }

    public static void swap(Person2 psn1, Person2 psn2) {

        psn1 = new Person2();

        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = age;

        psn2 = new Person2();

        String name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = name;
    }
}

class Person2 {
    int age;
    String name;

    void SayHi() {
        System.out.println(name + "[" + age + "] says Hi!");
    }
}


