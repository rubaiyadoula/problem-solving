package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class CF745A {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        HashSet<String> stringSet = new HashSet<>();

        for(int i = 0; i < string.length(); i++) {
            string = string.charAt(string.length() - 1) + string.substring(0, string.length() - 1);
            stringSet.add(string);
        }

        System.out.println(stringSet.size());
    }
}
