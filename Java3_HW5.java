/**
 * Created by Qursan on 8/28/2022.
 */
import java.util.Scanner;
public class Java3_HW5 {
    public static void main(String[] args) {
        System.out.println("enter three number:");
        Scanner hh=new Scanner(System.in);
        int n1= hh.nextInt();
        int n2= hh.nextInt();
        int n3= hh.nextInt();
        if (n1==n2&n2==n3)
            System.out.println("All the same");
        else if (n1!=n2&n2!=n3&n2!=n3)
            System.out.println("All different");
        else System.out.println("neither");

    }
}
