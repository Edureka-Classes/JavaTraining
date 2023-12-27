package assigment1.doWhileLoop;

public class TableOfTen {

    /* Write a program to generate tables of 10. */
    public static void main(String[] args) {

        int num = 10;
        int i = 1;

        do {
            int mult = num * i;
            System.out.println(num + " X " +i+ " = "+ mult);
            i++;
        }while (i<= num);

    }
}
