import java.util.*;

public class increasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }        
        System.out.println(numMoves(n, input));
        sc.close();
    }

    static int numMoves(int n, int[] arr) {
        if(n==0) return 0;
        int moves = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                moves += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1] + 1;
            }
        }
        return moves;
    }
}