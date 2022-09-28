import java.util.Scanner;

/**
 * Created by Qursan on 8/28/2022.
 */
public class Java3_HW1 {
    public static void main(String[] args) {
        //a
        int n = 1;
        int m = -1;
        if (n < -m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
        //b
        int a = 1;
        int b = -1;
        if (-a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        //c
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        //d
        double s = Math.sqrt(2);
        double w = 2;
        if (s * s == w)
            { System.out.println(s);}
        else
        {System.out.println(w); }

    }
}