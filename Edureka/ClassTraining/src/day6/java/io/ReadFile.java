package day6.java.io;

import java.io.*;

public class ReadFile {

    public static void main (String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("/Users/bsoft/Documents/Edureka/JavaTraining/ClassTraining/src/day6/java/io/java.txt"); // file absolute path
        /*
        System.out.println("No of characters to be read: " + fin.available());
        System.out.println(fin.read());
        System.out.println(fin.read());
        System.out.println("No of characters to be read: " + fin.available());
        */

        //-- to read file contents character by character

        /*

        int n = fin.read();
        while (n != -1){
            System.out.print((char)n);
            n = fin.read();
            Thread.sleep(100);
        }
        System.out.println();

        */

        /*
        //--- to read file contents completely

        byte[] b = new byte[fin.available()];
        fin.read(b); //storing character into byte array
        String str = new String(b);
        System.out.println(str);

        */

        //--- read file character line by line
        Reader fileSource = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(fileSource);
        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
            Thread.sleep(1000);
        }

        fin.close();

    }
}
