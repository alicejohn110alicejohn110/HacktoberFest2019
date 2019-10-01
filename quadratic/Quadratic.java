import java.io.*;

public class Quadratic {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The a b c in new lines");
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());
        int d = b * b - 4 * a * c;
        if (d < 0)
            System.out.println("The equation has Imaginary Roots");
        else {
            double alpha = (-b + Math.sqrt(d)) / (2 * a);
            double beta = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are" + alpha + "and" + beta);
        }
    }
}