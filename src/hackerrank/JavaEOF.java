package hackerrank;

import java.util.Scanner;

public class JavaEOF {
    public void solution() {
        long i = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
    }
}
