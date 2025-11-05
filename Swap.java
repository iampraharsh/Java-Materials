//public class Swap {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);
//
//    }
//}
//
//
//public class Swap {
//
//    // function to swap numbers
//    static void swapNumbers(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swap: " + a + " " + b);
//    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//
//        System.out.println("Before swap: " + x + " " + y);
//
//        swapNumbers(x, y);
//    }
//}


class Swap {

    static int sum(int... number) {
        int total = 0;
        for (int n : number) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2));
        System.out.println(sum(10, 20));
    }


}