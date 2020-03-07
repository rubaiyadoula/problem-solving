package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDS {

    public void reverseArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        scanner.close();

        //arr.iterator().forEachRemaining(k -> System.out.printf(k + " "));
        for(int i = n - 1; i > -1; i--) {
            if(i != 0)
                System.out.printf(arr.get(i) + " ");
            if(i == 0)
                System.out.println(arr.get(i));
        }
    }

}
