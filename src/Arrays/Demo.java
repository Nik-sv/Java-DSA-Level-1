package Arrays;

public class Demo {
    public static void main(String[] args) {
        // How to Declare the Array

        int[] arr;

        arr = new int[5];

        // Both are Same in every Aspect and actually we have merged the both the arrays


        int[] marks = new int[0];


        arr[0] = 33;
        arr[1] = 44;
        arr[2] = 51;
        arr[3] = 67;
        arr[4] = 98;

//        System.out.println(arr.length);
//        System.out.println(marks.length);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
// What we have Learned
        // 1 = How to Declare Array
        // 2 = How to allocate the space in Memory
        // 3 = How to allocate the value in the array
        // 4 = How to print the Length of the array
        // 5 = How to Apply the Loops in the Array



        int[] two = arr;
        two[2] = 590;

        for (int i = 0; i < two.length; i++) {  // Or chahe tho arr.length dono mai hi Same Answer aaya hai
            System.out.println(arr[i]);
        }


    }
}
