package Exercise;

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int no = sc.nextInt();

        /* create array to store no of subject marks */
        int[] marks = new int[no];

        for(int i = 0; i<marks.length; i++){
            System.out.print("Enter Mark for Sybject-"+(i+1)+" : ");
            marks[i] = sc.nextInt();
        }
        System.out.println("==========================================");
        System.out.println("\t\tREPORT CARD");
        System.out.println("==========================================");
        System.out.println("NAME: " +name);
        System.out.println("==========================================");
        System.out.println("SUBJECT \t\t MARKS");
        System.out.println("==========================================");

        int total = 0;
        for(int i = 0; i< marks.length;i++){
            total = total+marks[i];
            System.out.println("Subject-"+(i+1)+ "\t\t   "+marks[i]);
        }
        System.out.println("==========================================");
        float avg = ((float)total)/no;
        System.out.printf("TOTAL: %d \t  AVERAGE: %.2f\n", total, avg);
        System.out.println("==========================================");


        System.out.println(avg);
    }
}
