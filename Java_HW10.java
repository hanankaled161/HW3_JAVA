/**
 * Created by Qursan on 8/28/2022.
 */import java.util.Scanner;
public class Java_HW10 {
    public static void main(String[] args) {
        Scanner hh=new Scanner(System.in);
        System.out.println("enter number of the month ");
        int month=hh.nextInt();
        if(month==1)
            System.out.println("31 days");
        else if(month==2)
            System.out.println("28 days");
        else if(month==3)
            System.out.println("31 days");
        else if(month==4)
            System.out.println("30 days");
        else if(month==5)
            System.out.println("30 days");
        else if(month==6)
            System.out.println("30 days");
        else if(month==7)
            System.out.println("30 days");
        else if(month==8)
            System.out.println("31 days");
        else if(month==9)
            System.out.println("30 days");
        else if(month==10)
            System.out.println("31 days");
        else if(month==11)
            System.out.println("30 days");
        else if(month==12)
            System.out.println("30 days");
    }
}
