package Array;

public class ArrayCreation {

    public static void main(String[] args) {
        int [] marks = new int[7];
        marks[0] = 98;
        marks[1] = 76;

        for (int mark : marks){
            System.out.print(mark + "\t");
        }
        System.out.println();

        // For Boolean

        boolean [] status = new boolean[5];

        for(boolean stats : status){
            System.out.print(stats+ "\t");
        }
        System.out.println();

        // For String

        String [] names = new String[10];

        for (String name : names){
            System.out.print(name+"\t");
        }

        System.out.println();

        int [] arr = new int[] {94, 23, 34, 56, 69, 19, 48};
        for(int x : arr){
            System.out.print(x+ "\t");
        }
    }
}
