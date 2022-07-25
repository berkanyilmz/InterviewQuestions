public class Main {

    static long[] getMinMax(long a[], long n)
    {
        long min = a[0];
        long max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        return new long[]{min, max};
    }

    public static void main(String[] args) {
        long A[] = {3, 2, 1, 56, 10000, 167};
        long result[] = getMinMax(A, A.length);
        System.out.println("Min : " + result[0]);
        System.out.println("Max : " + result[1]);
    }
}