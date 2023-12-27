import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {

    /*
     * Complete the 'subsetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> subsetA(List<Integer> arr) {
        // Write your code here
        int totalSum = arr.stream().mapToInt(Integer::intValue).sum();
        int targetSum = (totalSum + 1) / 2;

        boolean[][] dp = new boolean[arr.size() + 1][targetSum + 1];

        for (int i = 0; i <= arr.size(); i++){
            dp[i][0] = true;
        }

        for (int i = 1; i <= arr.size(); i++){
            for (int j = 1; j <= targetSum; j++){
                dp[i][j] = dp[i - 1][j];
                if (arr.get(i - 1) <= j){
                    dp[i][j] |= dp[i - 1][j - arr.get(i -1)];

                }
            }
        }

        List<Integer> subsetA = new ArrayList<>();
        int i = arr.size();
        int j = targetSum;
        while(i > 0 && j > 0){
            if(dp[i][j] && dp[i - 1][j]){
                subsetA.add(arr.get(i -1));
                j -= arr.get(i -1);
            }
            i++;
        }

        return subsetA;

    }

    public static void main(String [] args){
        List<Integer> arr = new ArrayList<>(List.of(4, 2, 5));
        List<Integer> result = subsetA(arr);

        System.out.println("Subset A: " + result);
    }

}
