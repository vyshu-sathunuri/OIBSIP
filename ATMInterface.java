import java.util.Scanner;

public class ATMInterface {
    private static Scanner sc = new Scanner(System.in);
    private static double b = 0;
    
    public static void main(String[] args) {
        int ch;
        boolean q = false;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Balance Inquiry");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    balanceInquiry();
                    break;
                case 0:
                    q = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }
            
            System.out.println();
        } while (!q);
        
        System.out.println("Thank you for using our ATM");
    }
    
    private static void createAccount() {
        System.out.print("Enter your name: ");
        String n = sc.next();
        System.out.print("Enter your account number: ");
        int an = sc.nextInt();
        System.out.print("Enter your initial balance: ");
        b = sc.nextDouble();
        System.out.println("Account created successfully");
    }
    
    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double am = sc.nextDouble();
        
        if (b >= am) {
            b -= am;
            System.out.println("Transaction successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double am = sc.nextDouble();
        b += am;
        System.out.println("Transaction successful");
    }
    
    private static void balanceInquiry() {
        System.out.println("Your balance is " + b);
    }
}