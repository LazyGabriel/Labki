import java.util.Scanner;

public class EnterCHECKER {
    public static int Check (int x) {
        Scanner scn = new Scanner(System.in);
        int flag = 0;
        while (flag == 0) {
            System.out.println("Enter your Number:");
            scn.hasNextInt();
            if (scn.hasNextInt()) {
                x = scn.nextInt();
                flag++;
            } else {
                System.out.println("Not a number :(");
                scn.next();
            }
        }
        return x;
    }
}
