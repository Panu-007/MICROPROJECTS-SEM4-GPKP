import java.util.*;

public class Customer {

    static int pin = 1234;
    static double balance = 5000;

    static Scanner sc = new Scanner(System.in);

    public static void farwell()
    {
       System.out.println("\n\t**********************************************************");
       System.out.println("\n\n\n\n\t\tThank You For Doing Transaction with Us. \n");
       System.out.println("\n\n\t\t\t   See You Soon.");
       System.out.println("\n\t**********************************************************\n");
       
    }
    public static void pinUpdate()
    {  
        System.out.println("\n ");
        System.out.println("\n\n\n\n\t\t\tYour Updated Pin is:\n");
        System.out.println("\n\t\t\t>> " + pin);

        farwell();
    }
    public static void currentBalance()
    {
        System.out.println("\n\t*********************************************************");
        System.out.println("\n\n\n\n\t\t\tCurrent balance is:\n");
        System.out.println("\n\t\t\t>> " + balance + " Rs\n\n");
        farwell();   
    }

    public static void balanceUpdate(double amount, int choice)
    {
        if(choice == 2)
        {   
            balance -=  amount;
            System.out.println("\n\n\n\n\t\tYour account is debited by INR :\n" + amount);
            System.out.println();
            currentBalance();
        }
        else if(choice == 4)
        {   
            balance +=  amount;
            System.out.println("\n\n\n\n\t\tYour account is credited by INR :\n" + amount);
            System.out.println();
            currentBalance();
        }
    }


}