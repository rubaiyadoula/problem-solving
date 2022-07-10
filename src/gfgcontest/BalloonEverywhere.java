import java.util.HashMap;
import java.util.Scanner;

public class BalloonEverywhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toLowerCase();
        int size = s.length();
        HashMap<Character, Integer> pair = new HashMap();
        for (int i = 0; i < size; i++) {
            Character ch = s.charAt(i);
            if (pair.containsKey(ch)) pair.put(ch, pair.get(ch) + 1);
            else pair.put(ch, 1);
        }

        int bCntr = 0, aCntr = 0, lCntr = 0, oCntr = 0, nCntr = 0;

        for (Character key : pair.keySet()) {
            Integer value = pair.get(key);
            if (key == 'b') bCntr = value;
            else if (key == 'a') aCntr = value;
            else if (key == 'l') lCntr = value;
            else if (key == 'o') oCntr = value;
            else if (key == 'n') nCntr = value;
        }

        lCntr /= 2;
        oCntr /= 2;

        int result = Math.min(Math.min(Math.min(Math.min(bCntr, aCntr), lCntr), oCntr), nCntr);
        System.out.println(result);
    }
}
