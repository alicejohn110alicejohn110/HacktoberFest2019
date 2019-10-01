import java.io.*;
import java.util.*;

public class countNumberOfDigits {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(count(n));

    }

    public static int count(int n) {
        if (n == 0)
            return 0;
        return 1 + count(n / 10);
    }
}