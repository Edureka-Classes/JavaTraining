package day6.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main (String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("src/day6/stream/java.txt");

        System.out.println("No of characters to be read: " +fin.available());
        fin.close();

    }
}
