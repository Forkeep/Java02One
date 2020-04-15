import java.util.Arrays;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        var bs = ns;
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        System.out.println(Arrays.toString(bs));


    }

}
