package day3.oops.array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] marksPhysics = new int[4][];
        marksPhysics[0] = new int[12];
        marksPhysics[1] = new int[8];
        marksPhysics[2] = new int[10];
        marksPhysics[3] = new int[5];

        System.out.println("Size of array = " +marksPhysics.length);
        System.out.println();

        for(int i = 0; i < marksPhysics.length; i++) {
            System.out.println("Size of n[" + i + "] = " + marksPhysics[i].length);
        }
        System.out.println();

        /* Display array elements in a matrix form */
        for (int i = 0; i < marksPhysics.length; i++){
            for(int j = 0; j < marksPhysics[i].length; j++){
                System.out.print(marksPhysics[i][j]+ "       ");
            }
            System.out.println();
        }

        System.out.println();

        /* Display array elements in a matrix form */

        for(int[] x : marksPhysics){
            for(int y : x){
                System.out.print(y + "       " );
            }
            System.out.println();
        }
    }
}
