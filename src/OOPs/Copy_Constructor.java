package OOPs;



    class People{
        int age;
        String name;

        // Parametrized Constructor
        People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Copy Constructor
        People(People other) {
            this.age = other.age;
            this.name = other.name;
        }

        void display(){
            System.out.println(name + "[" + age + "] says hi!");
        }
    }
public class Copy_Constructor {
    public static void main(String[] args) {
        People original = new People(21 , "Nikhil");
        // Copy constructor se new object banaya
        People copy = new People(original);

        original.display();
        copy.display();
    }
}
