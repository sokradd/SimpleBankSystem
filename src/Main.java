import java.util.Scanner;

public class Main {
    static double balance = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Welcome to the Sokrad bank!");
            System.out.println("1. Check balance.");
            System.out.println("2. Withdraw balance.");
            System.out.println("3. Deposit balance.");
            System.out.println("4. Exit.");
            System.out.print("Enter an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                    case 2:
                        withdrawBalance();
                        break;
                        case 3:
                            depositBalance();
                            break;
                            case 4:
                                exit();
                                break;
                                default:
                                    System.out.println("Invalid option. Try again.");
                                    break;
            }
        }
    }
    public static void checkBalance() {
        System.out.println("Your current balance is: " + balance + "$");
    }
    public static void withdrawBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
        }
        checkBalance();
    }
    public static void depositBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("$" + amount + " has been deposited.");
        checkBalance();
    }
    public static void exit() {
        System.out.println("Thank you for using Sokrad bank! Have a great day!");
        System.exit(0);
    }
}
