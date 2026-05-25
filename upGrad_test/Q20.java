public class Q20 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int L = 10;
        int R = 20;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= L && arr[i] <= R) {
                count++;
            }
        }
        System.out.println("Count:" + count);
    }
}
