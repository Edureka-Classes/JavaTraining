package day3.array;

public class ArrayInitialization1 {

        public static void main(String[] args) {
            int[][] n = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

            System.out.println("Size of array = " +n.length);
            System.out.println();

            for(int i = 0; i < n.length; i++) {
                System.out.println("Size of n[" + i + "] = " + n[i].length);
            }
            System.out.println();

            /* Display array elements in a matrix form */
            for (int i = 0; i < n.length; i++){
                for(int j = 0; j < n[i].length; j++){
                    System.out.print(n[i][j]+ "       ");
                }
                System.out.println();
            }

            System.out.println();

            /* Display array elements in a matrix form */

            for(int[] x : n){
                for(int y : x){
                    System.out.print(y + "       " );
                }
                System.out.println();
            }
        }
}
