package enums;

import java.util.Scanner;

/**
 * Demonstrates enumerated types.
 * Created by m.losK on 2017-02-27.
 * based on Cay Horstmann's code
 */
public class EnumTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();

        if (input.startsWith("EXTRA")) {
            input = "EXTRA_LARGE";
        }

        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size: " + size);
        System.out.println("abbreviation: " + size.getAbbreviation());

        in.close();
    }
}