package Strings;

import java.util.Arrays;

public class StringsMethods2 {

    public static void main(String[] args) {
        String str = "Java is a high level Programming Languege";

        String[] words = str.split(" ");
        System.out.println("no of words in \""+str+"\" ="  + words.length);
        System.out.println(Arrays.toString(words));

        String str1 = String.join(" * ", words);
        System.out.println(str1);
    }
}
