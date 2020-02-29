public class Main {
    public static void main (String[] args) {
        int First = 0;
        int Second = 0;
        First = EnterCHECKER.Check(First);
        Second = EnterCHECKER.Check(Second);
        Tasker.task1(First, Second);
        System.out.println("Program served me well, shutting down...");
    }
}