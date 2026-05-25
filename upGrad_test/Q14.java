public class Q14 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, -3, 8 };

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
