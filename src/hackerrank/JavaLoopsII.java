package hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        for(int i = 0; i < iter; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int flag = a + b;

            for(int j = 1; j <= n; j++) {
                if(j == n)
                    System.out.println(flag);
                else
                    System.out.print(flag + " ");
                flag += Math.pow(2, j) * b;
            }
        }

        scanner.close();
    }
}
