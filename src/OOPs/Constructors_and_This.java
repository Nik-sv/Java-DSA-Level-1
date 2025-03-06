package OOPs;

public class Constructors_and_This {
    public static class Person3 {
        int age;
        String name;

        void sayHi(){
            System.out.println(name + "[" + age + "] says hi");
        }

        // if we forget, java Provides a default constructor => Agar ham daalna bhul gaye tho java apni marzi se daal deti hai aur add kar deti hai class k andar
        Person3(){
            // constructor => cunstructor who function hai jo tab call hota hai jab class ka object ban raha hota hai => Bina Parameter wala Defualt Cunstructor kahete hai aur aur agar mai parameter daal du tho usse parameterized constructor kahete hai
        }

        // Parameterized
        Person3(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person3 p1 = new Person3();
        p1.age = 10;
        p1.name = "A";
        p1.sayHi();


        Person3 p2 = new Person3(20 , "B");
        p2.sayHi();
    }
}
