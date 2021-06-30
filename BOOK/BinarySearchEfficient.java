package BOOK;

public class BinarySearchEfficient {
    public static void main(String[] args) {

        int[] array ={10, 8, 1, 2, 11, 4, 5, 6, 7, 8};
        int n = array.length;
        int k = 0;
        int x = 5;
        for (int b = n/2; b >= 1; b /= 2) {
            while (k+b < n && array[k+b] <= x)
                k += b;
        }
        if (array[k] == x) {
            // x found at index k
            System.out.println(k);
        }
    }
}
