package hackerrank;

import java.util.Scanner;

public class ArrayLeftRotation {

    public void leftRotate() {
        Scanner scanner = new Scanner(System.in);

        String[] scanNeD = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanNeD[0]);
        int d = Integer.parseInt(scanNeD[1]);

        int[] arr = new int[n];

        String[] arrayItems = scanner.nextLine().split(" ");

        int track = d;

        for(int i = 0; i < n; i++) {
            int anItem = Integer.parseInt(arrayItems[i]);
            arr[i] = anItem;
        }

        scanner.close();

        System.out.print(arr[track] + " ");

        while (track < (n - 1)) {
            track++;
            System.out.print(arr[track] + " ");
        }

        int i = 0;

        while (track == (n - 1) && i < d) {
            if(i == (d - 1))
                System.out.println(arr[i]);

            else
                System.out.print(arr[i] + " ");

            i++;
        }
    }

}
