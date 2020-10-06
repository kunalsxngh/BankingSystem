import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    private Scanner scanner;
    private HashMap<String, Integer> accounts=new HashMap<String, Integer>();

    private BankingSystem(){
        this.scanner = new Scanner(System.in);
        this.accounts = new HashMap<String, Integer>();
        createAccount();
    }

    private void processCreateAccount(){
        this.createAccount();

    }
    private void createAccount(){
        int IIN = 400000;
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        String accountNumber = Integer.toString(IIN) + Long.toString(number);
        int pin = (int) (Math.random() * 9000 + 1000);
        this.accounts.put(accountNumber, pin);
        System.out.println("Account created!, your account number is: " + accountNumber);
        System.out.println("Your pin is: "  + pin);
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem1 = new BankingSystem();
    }

}
