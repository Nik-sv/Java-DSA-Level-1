//package OOPs;
//
//public class Classes_and_Objects {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 10;
//        p1.name = "Nikhil";
//        p1.SayHi();
//    }
//
//    static class Person {
//
//        int age;
//        String name;
//
//        void SayHi(){
//            System.out.println(name + "[" + age + "]" + "SayHi" );
//        }
//
//    }
//
//}



package OOPs;

public class Classes_and_Objects {
    public static void main(String[] args) {

        // Objects hai class Person k
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        Person p7 = new Person();

        // Ye object hai class People
        People c1 = new People();
        People c2 = new People();
        People c3 = new People();

       Person p9 = p1;
       p9.age = 34;
       p1.SayHi();;
       p9.SayHi();  // correct hai mai p9 ko p3 likh raha tha jis wajhe se confusion aa raha tha

        p1.age = 21;
       // p1.age = 66;
        p1.name = "Nikhil";
        p1.SayHi();

        p2.age = 24;
        p2.name = "Archit";
        p2.SayHi();

        p3.age = 25;
        p3.name = "Purshotam";
        p3.SayHi();

        p4.age = 26;
        p4.name = "Anjali";
        p4.SayHi();

        p5.age = 27;
        p5.name = "Sanya";
        p5.SayHi();

        p6.age = 20;
        p6.name = "Rahul";
        p6.SayHi();

        p7.age = 30;
        p7.name = "Nishant";
        p7.SayHi();

        c1.age = 9;
        c1.name = "Vikram";
        c1.SayHello();

        c2.age = 10;
        c2.name = "Saurabh";
        c2.SayHello();

        c3.age = 11;
        c3.name = "Prashant";
        c3.SayHello();
    }


    static class Person {

        int age;
        String name;

        void SayHi() {
            System.out.println(name + " [" + age + "] says Hi!");
        }
    }


    static class People {

        int age;
        String name;

        void SayHello() {
            System.out.println(name + " [" + age + "] says Hello!");
        }
    }
}
