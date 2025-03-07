package OOPs;

public class Constructor_and_This_Keyword {
    public static void main(String[] args) {

        // Default Constructor used
        Person3 p1 = new Person3();
        p1.age = 21;
        p1.name = "Nikhil";
        p1.SaysHi();


        // Parameterized Constructor
        Person3 p2 = new Person3(19 , "Prashant");
        p2.SaysHi();
    }


}

class Person3 {
    int age;
    String name;

    void SaysHi() {
        System.out.println(name + "[" + age + "] says Hi!");
    }
    // If we forget, java provides our class a default constructor
    Person3(){
        // constructor
    }

    //Parameterized
    Person3(int age , String name){
        this.age = age;
        this.name = name;
    }

}





