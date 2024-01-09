package co.edureka.module2;

import java.util.Scanner;

public class Statement1 {

    /*
        1. Write a program to accept 5 employee IDs and the corresponding names and their salaries
        from the user and store them in three arrays.Pass these arrays to a function display() as
        arguments. This display() will display the content of the arrays in the following format.

        ID      Name    Salary
        00      John    600000
        002     Clark   550000
        003     Nancy   500000
        004     Joe     500000
        005     Mary    300000
  */

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //initialize array
        String [] empId = new String[3];
        String [] empName = new String[3];
        double [] empSalary = new double[3];

        //accepting employee details
        for(int i = 0; i < 3; i++){
            System.out.println("Enter Employee Details: ");
            empId[i] = sc.next();
            empName[i] = sc.next();
            empSalary[i] = sc.nextDouble();
        }

        display(empId, empName, empSalary);

        sc.close();

    }

    public static void display(String id[], String name[], double salary[]){

        System.out.println("ID \t\t\t" + "NAME \t\t\t" + "SALARY");
        for (int i = 0; i < id.length; i++){
            System.out.printf( "%-12s %-15s %.2f \n",id[i], name[i], salary[i]);
        }
    }
}
