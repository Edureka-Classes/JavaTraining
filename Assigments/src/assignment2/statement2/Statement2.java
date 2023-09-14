package assignment2.statement2;

import java.util.Scanner;

public class Statement2 {

    // display function
    public void display(String id[], String name[], double salary[]){

        System.out.println("ID \t\t\t NAME \t\t\t SALARY");

        for(int i=0; i< id.length; i++){
            System.out.println(id[i] + "\t\t\t" + name[i] + "\t\t\t" +salary[i]);
        }

    }

    public void display(String id[], String name[]){

        System.out.println("ID           NAME");

        for (int i = 0; i < id.length; i++){
            System.out.println(id[i]+"          " +name[i]);
        }

    }


    public static void main(String[] args) {
        String id[] = new String[3];
        String name[] = new String[3];
        double salary[] = new double[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < id.length; i++){
            System.out.print("Enter Employee Details: ");
            id[i] = sc.next();
            name[i] = sc.next();
            salary[i] = sc.nextDouble();
        }

        Statement2 s1 = new Statement2();
        System.out.println();
        s1.display(id, name, salary);

        System.out.println();
        s1.display(id, name);
    }
}
