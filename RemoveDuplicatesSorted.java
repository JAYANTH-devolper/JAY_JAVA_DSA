public class RemoveDuplicatesSorted {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int length = removeDuplicates(arr);

        System.out.print("Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLength: " + length);
    }

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}