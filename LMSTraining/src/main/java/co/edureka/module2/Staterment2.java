package assignment2.statement1;
import java.util.Scanner;

public class Staterment2 {
    // display function
    void display(String id[], String name[], double salary[] ){
        System.out.println("ID\t\t\t" + "NAME\t\t\t" +"Salary");
        for(int i = 0; i<id.length; i++){
            System.out.println(id[i] +"\t\t\t"+ name[i] +"\t\t\t"+ salary[i]);
        }
    }

    /*
        2. Write another function display() withEmployee ID array and Employee name array as
        arguments. (Note: here we are using concept of function overloading).
        This function will display the content of the 2 arrays in the following format.
        ID          Name
        00          John
        002         Clark
        003         Nancy
        004         Joe
        005         Mary
     */
    void display (String id[],String name[]){
        System.out.println("ID\t\t\t" + "Name\t\t\t");
        for(int i = 0; i<id.length; i++){
            System.out.printf("%-10s %-15s \n",id[i], name[i] );
        }
    }

    public static void main(String[] args) {
        // Initialize the Arrays
        String[] id = new String[2];
        String[] name = new String[2];
//        double[] salary = new double[3];

        // Accepting employee details
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.print("Enter Employee Details: ");
            id[i] = sc.next();
            name[i] = sc.next();
//            salary[i] = sc.nextDouble();
        }
        Staterment2 m1 = new Staterment2();
        System.out.println();
//        m1.display(id, name, salary);
        m1.display(id,name);
    }
}
