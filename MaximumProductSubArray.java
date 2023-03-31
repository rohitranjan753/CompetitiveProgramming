// Maximum product of subarray

class MaximumProductSubArray {
    static int maxSubarrayProduct(int arr[]) {
        // Initializing result
        int result = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28 };
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}
