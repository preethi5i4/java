import java.io.*;
import java.util.*;
public class weeks {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int daynum=0;
        System.out.println("Enter the weekday number : ");
        daynum=input.nextInt();
        switch(daynum)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
               System.out.println("Invalid,please enter 0 to 6...");
    }
}
}
             
    
        
        
                
           
        