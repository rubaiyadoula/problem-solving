package hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String string = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", string, x);
        }
        scanner.close();
        System.out.println("================================");
    }
}
