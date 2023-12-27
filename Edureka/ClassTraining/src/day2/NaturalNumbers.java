package day2;

public class NaturalNumbers {
    public static void main(String[] args) {

        int num = 10;
        int i = 1;

        System.out.println("First 10 Natural Numbers are: ");
//        for(int i = 1; i <= num; i++){
//            System.out.println(i);
//        }

//        while(i <= num){
//            System.out.println(i);
//            i++;
//        }

        do{
            System.out.println(i);
            i++;
        }while (i <= num);
    }
}
