import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; // Starting balance
        int choice;
        
        System.out.println("=== WELCOME TO ATM ===");
        
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Your Balance: Rs." + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: Rs.");
                    double deposit = sc.nextDouble();
                    if(deposit > 0) {
                        balance += deposit;
                        System.out.println("Money deposited successfully!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter amount to withdraw: Rs.");
                    double withdraw = sc.nextDouble();
                    if(withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash!");
                    } else if(withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 4);
        
        sc.close();
    }
}
