public class Q13 {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 0, 4, -5, 0 };

        int postive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                postive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Postive:" + postive);
        System.out.println("Negative:" + negative);
        System.out.println("Zero:" + zero);
    }
}
