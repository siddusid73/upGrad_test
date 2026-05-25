public class Q10 {
    public static void main(String[] args) {
        int[] arr = { 25, 5, 5, 64, 66, 46 };
        int N = 2;
        int firstSum = 0;
        int lastSum = 0;

        for (int i = 0; i < N; i++) {
            firstSum += arr[i];
        }
        for (int i = arr.length - N; i < arr.length; i++) {
            lastSum += arr[i];
        }
        System.out.println("First N Sum:" + firstSum);
        System.out.println("Last N Sum:" + lastSum);
    }
}
