public class Tasker {
    public static void task1 (int a, int b) {
        if (a < b) {
            while (a <= b) {
                int d = 2;
                while ((d * d <= a) && (a % d != 0)) {
                    d++;
                }
                if ((d * d > a) && (a != 1) && (a > 0)) {
                    System.out.print (a + " ");
                }
                a++;
            }
        } else {
            while (b <= a) {
                int d = 2;
                while ((d * d <= b) && (b % d != 0)) {
                    d++;
                }
                if ((d * d > b) && (b != 1) && (b > 0)) {
                    System.out.print (b + " ");
                }
                b++;
            }
        }
        System.out.println();
    }
}
