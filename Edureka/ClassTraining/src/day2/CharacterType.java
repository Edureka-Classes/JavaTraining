package day2;

public class CharacterType {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        c = 65; //implicit typecasting
        System.out.println(c);

        System.out.println("Hexa decimal value of 65 = " +Integer.toHexString(65));

        c = '\u0041';
        System.out.println(c);
    }
}
