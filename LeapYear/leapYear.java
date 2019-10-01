import java.io.*;
import java.util.*;

public class leapYear {
    public static void main(String args[]) throws IOException {
        int count = 0;
        int year = 2000;
        while (count <= 80) {
            if (isLeap(year))
                System.out.println(year);
            year++;
            count++;
        }
    }

    public static boolean isLeap(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}