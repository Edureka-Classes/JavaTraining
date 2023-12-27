package day6.java.io;

import java.io.FileWriter;

public class WriteFile1 {

    public static void main (String[] args) throws Exception {
        //FileWriter fw = new FileWriter("/Users/bsoft/Documents/Edureka/JavaTraining/ClassTraining/src/day6/java/io/edureka1.txt");
        FileWriter fw = new FileWriter("/Users/bsoft/Documents/Edureka/JavaTraining/ClassTraining/src/day6/java/io/edureka1.txt", true); // to append more characters or lines use "true"

        String str = "Dear Buhari ,\n" +
                "\n" +
                "We hope you are having a great day!!!\n" +
                "\n" +
                "We wish you a very happy and safe Diwali. This Diwali, we are taking a day off from 12 Nov 2023, 8 AM IST - 13 Nov 2023, 8 AM IST. As a result, the support experts will not be available over calls/emails during this time period, however, you could raise your tickets and the same would be responded to as soon as we resume work. Also, there will be no classes on 11th and 12th Nov 2023.\n" +
                "\n" +
                "Thank you for understanding.";
        fw.write(str);
        System.out.println("file saved!!");

        fw.close();
    }
}
