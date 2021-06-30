package BOOK;

public class MaximumSubArray {
    public static void main(String[] args) {
        // O(n) Algo
        int[] arr ={-2, 1, 2, 3, 4, -4, -5};
        int n = arr.length;
        int best = 0, sum = 0;
        for (int k = 0; k < n; k++) {
            sum = Math.max(arr[k],sum+arr[k]);
            best = Math.max(best,sum);
        }
        System.out.println(best);

        // O(n^2) Algo
//        int[] arr ={-2, 1, 2, 3, 4, -4, -5};
//        int n = arr.length;
//        int best = 0;
//        for (int a = 0; a < n; a++) {
//            int sum = 0;
//            for (int b = a; b < n; b++) {
//                sum += arr[b];
//                best = Math.max(best,sum);
//            }
//        }
//        System.out.println(best);
    }
}
