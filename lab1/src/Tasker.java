public class Tasker {
    public static void task1 (int a, int b) {
        int cm=min(a,b);
        int dm=max(a,b);
            while (cm <= dm) {
                int d = 2;
                while ((d * d <= cm) && (cm % d != 0)) {
                    d++;
                }
                if ((d * d > cm) && (cm != 1) && (cm > 0)) {
                    System.out.print (cm + " ");
                }
                cm++;
            }
        System.out.println();
    }
}
