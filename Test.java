public class Test {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(a));

    }

    public static int sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

}



