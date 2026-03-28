import java.util.Stack;
public class GreaterElementStack {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }
    public static void main(String[] args) {
        GreaterElementStack obj = new GreaterElementStack();
        int[] nums = {1, 2, 1};
        int[] result = obj.nextGreaterElements(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
