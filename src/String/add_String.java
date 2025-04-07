package String;

public class add_String {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//
//
//        // String ko add karne k liye plus ka operator likho who add ho jati hai
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//
//
//        // ab agar khu mai hi change lane ho tho
//        s1 += ' ';
//        s1 += 'w';
//        s1 += 'o';
//        s1 += ' ';
//        s1 += 10;
//
//
//
//        String s4 = s + " " + s1 + " " + s2;
//        System.out.println(s4);

//        System.out.println("hello" + 10 + 20);   // ans = hello1020  ,, because left to right evaluate hota hai   => pahelay hello string hai integer se mila aur string ban gaya aur fir hello10 string hai aur 20 integer se mila tho string bana iya lakin opposte hota tho
//        System.out.println(10 + 20 + "hello");   // 30hello  // pahelay integer aur integer tho 30 phir integer aur String tho phir 30hello


        // You know difference between  = , +=


        // last is Split function
        String s1 = "abcfdgf,afarcomma,def,ghi,jkl mno";
        // tho jab aap split karoge tho actually who sab ke seprate array bana dega = abc , def , ghi , jkl
        // ye kab kaam ata hai ye input lete wakqt kaam aata hai

        String[] parts = s1.split(",");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }
}
