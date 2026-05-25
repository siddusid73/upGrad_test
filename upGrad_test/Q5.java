public class Q5 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20 };
        int target = 15;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
