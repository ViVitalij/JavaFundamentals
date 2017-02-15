package myUtils;

import java.util.Scanner;

/**
 * Created by m.losK on 2017-02-15.
 */
public class ScannerUtils {
    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert your number: ");
    }

    public static int getNumberFromUser(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }

}
