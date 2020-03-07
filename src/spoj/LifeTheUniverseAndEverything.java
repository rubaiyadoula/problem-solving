package spoj;

import java.util.Scanner;

public class LifeTheUniverseAndEverything {

    public void solution() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int number = scanner.nextInt();
            if(number == 42)
                break;
            System.out.println(number);
        }

        scanner.close();
    }

}
