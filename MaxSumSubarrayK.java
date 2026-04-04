public class MaxSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = maxSumSubarray(arr, k);
        System.out.println("Maximum Sum: " + maxSum);
    }

    public static int maxSumSubarray(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i];
            windowSum -= arr[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
}