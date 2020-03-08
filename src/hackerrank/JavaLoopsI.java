package hackerrank;

import java.util.Scanner;

public class JavaLoopsI {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int lp = scanner.nextInt();
        for(int i = 1; i < 11; i++)
            System.out.println(lp + " x " + i + " = " + lp * i);
        scanner.close();
    }
}
