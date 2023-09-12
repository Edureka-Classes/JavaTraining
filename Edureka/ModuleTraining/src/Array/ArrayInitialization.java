package Array;

public class ArrayInitialization {
    public static void main(String[] args) {
        int [] marks = {98, 86, 92, 94, 75, 83};
        System.out.println("No of Subjects = " +marks.length);

        for(int i = 0; i < marks.length; i++){
            System.out.println("Mark for Subject-" +(i + 1) + " = " +marks[i] );
        }

        /* array iteration using extended for loop */
        System.out.print("Marks Obtained : ");
        for( int mark : marks){
            System.out.print(mark + " | ");
        }
    }


}
