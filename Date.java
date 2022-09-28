/**
 * Created by Qursan on 28/08/22.
 */import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        String season;
        System.out.println("enter of number the day ");
        Scanner hh=new Scanner(System.in);
        int day=hh.nextInt();
        System.out.println("enter of number the month ");
        int month=hh.nextInt();
        if(month%3<5&day>=21)
        {
            if(month==1||month==2||month==3)
                season ="  winter";
            else if(month==4||month==5||month==6)
                season = " spring";
            else if(month==7||month==8||month==9)
                season = " summer";
            else if(month==10||month==11||month==12)
               season ="  fall";
        }
        else
        {if(month==1||month==2||month==3)
            System.out.println("season = winter ");
        else if (month==4||month==5||month==6)
            System.out.println("season = spring ");
        else if(month==7||month==8||month==9)
            System.out.println("season = summer ");
        else if(month==10||month==11||month==12)
            System.out.println("season =fall ");
        }
    }

}
