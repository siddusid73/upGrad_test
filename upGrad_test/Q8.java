public class Q8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7 };
        int target = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Occurrence:" + count);
    }
}
