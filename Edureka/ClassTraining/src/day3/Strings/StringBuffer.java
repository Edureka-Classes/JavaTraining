package day3.Strings;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();

        System.out.println(sb + " |size = " +sb.length() + " |capacity = " + sb.capacity());

        sb.append("edureka limited");
        System.out.println(sb + " |size = " +sb.length() + " |capacity = " + sb.capacity());

        sb.insert(0, "****");
        System.out.println(sb + " |size = " +sb.length() + " |capacity = " + sb.capacity());

        sb.insert(2, 101);
        System.out.println(sb + " |size = " +sb.length() + " |capacity = " + sb.capacity());

        sb.reverse();
        System.out.println(sb);

    }
}
