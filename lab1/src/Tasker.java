import static java.lang.Math.*;

public class Tasker {
    public static void task1 (int a, int b) {
        int cm=Math.min(a,b);
        int dm=Math.max(a,b);
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

