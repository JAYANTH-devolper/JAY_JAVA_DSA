public class TwoSumSortedTP {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        findTwoSum(arr, target);
    }

    public static void findTwoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found");
    }
}