package hackerrank;

import java.util.Scanner;

public class StaticInitBlock {
    private static Scanner scanner = new Scanner(System.in);
    private static int B = scanner.nextInt();
    private static int H = scanner.nextInt();
    private static boolean flag = B > 0 && H > 0;

    static {
        if(!flag)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public void solution() {
        if(flag)
            System.out.print(B*H);
    }
}
