import java.util.*;

public class Operations {
    
    static Scanner sc = new Scanner(System.in);
    public static void checkBalance()
    {
        Customer.currentBalance();   
    }
    public static void amountUpdate()
    {
        System.out.println("\n\t*********************************************************");
        System.out.println("\n\n\n\n\t\t\tEnter your Amount:\n");
        System.out.print("\n\t\t\t>> ");
        double amount = sc.nextInt();

        Customer.balanceUpdate(amount, Choices.choice);
    }
    public static void changePin()
    {
        System.out.println("\n\t*********************************************************");
        System.out.println("\n\n\n\n\t\t\tEnter your new pin:\n");
        System.out.print("\n\t\t\t>>");
        Customer.pin = sc.nextInt();

        Customer.pinUpdate();
    }
   

}
