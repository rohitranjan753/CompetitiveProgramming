
// Java program for the above approach
import java.io.*;

class AliceAppleTree {

    // Function to minimum no. of apples
    static int minApples(int M, int K, int N, int S, int W, int E) {

        // If we get all required apple
        // from South
        if (M <= S * K)
            return M;

        // If we required trees at
        // East and West
        else if (M <= S * K + E + W)
            return S * K + (M - S * K) * K;

        // If we doesn't have enough
        // red apples
        else
            return -1;
    }

    // Driver code
    public static void main(String[] args) {
        // No. of red apple for gift
        int M = 10;

        // No. of red apple in each tree
        int K = 15;

        // No. of tree in North
        int N = 0;

        // No. of tree in South
        int S = 1;

        // No. of tree in West
        int W = 0;

        // No. of tree in East
        int E = 0;

        // Function Call
        int ans = minApples(M, K, N, S, W, E);
        System.out.println(ans);
    }
}

// This code is contributed by code_hunt.
