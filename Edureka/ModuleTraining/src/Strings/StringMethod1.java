package Strings;

public class StringMethod1 {

    public static void main(String[] args) {
        String s1 = new String("edureka");
        String s2 = new String("edureka");
        String s3 = new String("Edureka");

        System.out.println("(s1==s2) ---> "+ (s1==s2));
        System.out.println("equals() ---> "+ s1.equals(s2));
        System.out.println("contentEquals() ---> "+ s1.contentEquals(s3));
        System.out.println("equalsIgnoreCase() ---> "+ s1.equalsIgnoreCase(s3));

        System.out.println();

        s1 = "ABC";
        //s2 = "ABC";
        s2 = "ADA";
        int n = s1.compareTo(s2);
        System.out.println(n);

    }
}
