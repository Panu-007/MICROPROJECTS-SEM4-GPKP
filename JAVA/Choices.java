import java.util.*;

public class Choices {
    
    static Scanner sc = new Scanner(System.in);
    
    static int choice;
    static void menu()
    {
        System.out.println("\n\t*********************************************************");
        System.out.println("\n\n\n\n\t\t\tChoose your choice:\n");
        System.out.println("\t1.Check Balance \t\t\t 2.Withdraw Money.\n\n");
        System.out.println("\t3.Change PIN \t\t\t\t 4.Deposite Money.\n\n");
        System.out.print("\n\t\t\t>>");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1 : Operations.checkBalance(); break;
            case 2 : Operations.amountUpdate(); break;
            case 3 : Operations.changePin(); break;
            case 4 : Operations.amountUpdate(); break;
            default : System.out.println("\n\t\t\tInvalid choice. Process terminated.\n");
        }
        
    }

    static void pin_verify()
    {
        System.out.println("\n\t*********************************************************");
        System.out.println("\n\n\n\n\t\t\tEnter your pin:\n");
        System.out.print("\n\t\t\t>>");
        int pin_num = sc.nextInt();

        if(pin_num == Customer.pin)
        {   System.err.println("\n");
            menu();
        }
        else
        {   System.out.println("\n\t\t\tInvalid PIN. Process terminated.\n");
            System.exit(0);
        }

    }
    static void greeting()
    { 
       System.out.println("\n\t**********************************************************");
       System.out.println("\n\n\n\n\t\t\tWELCOME TO OUR ATM INTERFACE \n");
       System.out.println("\n\n\t\t\tPress Any Char Key To Continue");
       System.out.print("\n\t\t\t>>");
       String input = sc.next();

       if(input.isEmpty() != true)
        {
            pin_verify();
        }

    }
}
