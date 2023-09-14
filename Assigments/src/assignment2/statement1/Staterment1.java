package assignment2.statement1;

import java.util.Scanner;

public class Staterment1 {

    // display function
    void display(String id[], String name[], double salary[] ){

        System.out.println("ID\t\t\t" + "NAME\t\t\t" +"Salary");

        for(int i = 0; i<id.length; i++){
            System.out.println(id[i] +"\t\t\t"+ name[i] +"\t\t\t"+ salary[i]);
        }
    }


    public static void main(String[] args) {
        // Initialize the Arrays
        String[] id = new String[3];
        double[] salary = new double[3];
        String[] name = new String[3];

        // Accepting employee details
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Enter Employee Details: ");
            id[i] = sc.next();
            name[i] = sc.next();
            salary[i] = sc.nextDouble();
        }

        Staterment1 m1 = new Staterment1();
        System.out.println();
        m1.display(id, name, salary);
    }
}
