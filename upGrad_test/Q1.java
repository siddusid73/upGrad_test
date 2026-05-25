class Q1 {
    public static void main(String[] args) {
        int[] arr = { 12, 14, 5, 7, 19, 20 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element:" + max);
    }
}