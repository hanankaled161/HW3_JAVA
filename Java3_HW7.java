/**
 * Created by Qursan on 8/28/2022.
 */
import java.util.Scanner;
public class Java3_HW7 {

    public static void main(String[] args) {
        System.out.println("enter three number::");
        Scanner hh=new Scanner(System.in);
        int n1= hh.nextInt();
        int n2= hh.nextInt();
        int n3= hh.nextInt();
        if(n1<=n2&n2<=n3||n1>=n2&n2>=n3)
            System.out.println("in order");
        else if(n2>n3&n1<n3||n2<n3&n1>n3)
            System.out.println("not in order");
}}
