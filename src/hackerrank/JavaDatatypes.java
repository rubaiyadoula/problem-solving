package hackerrank;

import java.util.Scanner;

public class JavaDatatypes {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            try {
                long num = scanner.nextLong();
                System.out.println(num + " can be fitted in:");
                if(num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE)
                    System.out.println("* byte\n* short\n* int\n* long");

                else if(num <= Short.MAX_VALUE && num >= Short.MIN_VALUE)
                    System.out.println("* short\n* int\n* long");

                else if(num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE)
                    System.out.println("* int\n* long");

                else if(num <= Long.MAX_VALUE && num >= Long.MIN_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
