package assignment2.statement3;

import java.util.Scanner;

public class Statement3 {
    void display(String regno[], String name[]){

        System.out.println("ID \t\t\t NAME");
        for (int i = 0; i < regno.length; i++){
            System.out.println(regno[i] + "\t\t\t" + name[i]);
        }
    }

    void display(String regno[], String name[], double salary[]){

        System.out.println("ID \t\t\t NAME \t\t\t SALARY");
        for (int i = 0; i < regno.length; i++){
            System.out.println(regno[i] + "\t\t\t" + name[i] + "\t\t\t" +salary[i]);
        }
    }

    void display(String name, String regno[], String empname[], double salary[]){

        System.out.println("ID \t\t\t NAME  \t\t\t SALARY");
        for (int i = 0; i < regno.length; i++){

            if(empname[i].equals(name))
                System.out.println(regno[i] + "\t\t\t" + empname[i] + "\t\t\t" +salary[i]);

        }
    }

    public static void main(String[] args) {
        String regno[] = new String[2];
        String empname[] = new String[2];
        double salary[] = new double[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.print("Enter Employee Details: ");
            regno[i] = sc.next();
            empname[i] = sc.next();
            salary[i] = sc.nextDouble();
        }

        Statement3 st3 = new Statement3();
        System.out.println();
        st3.display(regno, empname );

        System.out.println();
        st3.display(regno, empname, salary);

        System.out.println();
        System.out.print("Enter the name to search for: ");
        String name = sc.next();
        st3.display(name, regno, empname, salary);
    }

}
