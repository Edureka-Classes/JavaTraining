package day6.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteFile {
    public static void main (String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("/Users/bsoft/Documents/Edureka/JavaTraining/ClassTraining/src/day6/java/io/edureka.txt");
        String str = "Dear Buhari ,\n" +
                "\n" +
                "We hope you are having a great day!!!\n" +
                "\n" +
                "We wish you a very happy and safe Diwali. This Diwali, we are taking a day off from 12 Nov 2023, 8 AM IST - 13 Nov 2023, 8 AM IST. As a result, the support experts will not be available over calls/emails during this time period, however, you could raise your tickets and the same would be responded to as soon as we resume work. Also, there will be no classes on 11th and 12th Nov 2023.\n" +
                "\n" +
                "Thank you for understanding.";
        byte [] data = str.getBytes();
        fout.write(data);
        System.out.println("file saved!!");
    }
}
