package day2;

public class NaturalNumbers3 {

    static void printNaturals(){
        System.out.println("First 10 Natural Numbers are: ");

        int num = 10;
        int i = 1;
        while(i <= num){
            if(i == num)
                System.out.println(i);
            else
                System.out.print(i + " , ");
            i++;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        /* -- method definition to display first 10 Natural Numbers */

       printNaturals();
       printNaturals();
       printNaturals();
    }
}
