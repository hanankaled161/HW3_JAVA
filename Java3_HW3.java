import java.util.Scanner;

/**
 * Created by Qursan on 8/28/2022.
 */
public class Java3_HW3 {
    public static void main(String[] args) {
        //3
        System.out.println("Enter integer number : ");
        Scanner number = new Scanner(System.in);
        int num;
        num = number.nextInt();
        if (num > 0) {System.out.println(1);}
        else if (num < 0) {System.out.println(0);}
    }
}
