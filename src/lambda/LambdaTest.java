package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by m.losK on 2017-03-21.
 * based on Cay Horstmann's code
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] daysOfTheWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(daysOfTheWeek));
        System.out.println("Alphabetical sort:");
        Arrays.sort(daysOfTheWeek);
        System.out.println(Arrays.toString(daysOfTheWeek));
        System.out.println("Sort by length:");
        Arrays.sort(daysOfTheWeek, Comparator.comparingInt(String::length));
        //the same as below
//        Arrays.sort(daysOfTheWeek, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(daysOfTheWeek));

        Timer timer = new Timer(2000, event -> System.out.println("Now is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "Close?");
        System.exit(0);
    }
}
