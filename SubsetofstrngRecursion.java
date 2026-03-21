public class SubsetofstrngRecursion {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "");
    }

    public static void subset(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        subset(ros, ans + ch);
        subset(ros, ans);
    }
}