package BASICS;

public class DataType {

    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is " +sum );

        // prd stands for Product

        int prd = x * y;
        System.out.println("Product of " + x + " and " + y + " is " +prd );

        // x/y , y/x & x%y

        int dv1 = x / y;
        System.out.println("Division of " + x + " and " + y + " is " +dv1 );


        int dv2 = y / x;
        System.out.println("Division of " + y + " and " + x + " is " +dv2 );

        int modulus = x % y;
        System.out.println("Division of " + x + " and " + y + " is " +modulus );


        // BODMAS RULES

        int BD = x  * y / x + y;
        System.out.println("Division of " + x * y + " and " + x + y + " is " +BD );


        int BD1 = (x  * y) / (x + y);
        System.out.println("Division of " + (x * y) + " and " + (x + y) + " is " +BD1 );

    }
}
