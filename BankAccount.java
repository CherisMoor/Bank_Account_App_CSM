import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "original.csv";
        /*
         * Testing to see if coding/methods worked===== Checking chkacc1 = new
         * Checking("Tom Wilson", "321456879", 1500); Savings savacc1 = new
         * Savings("Rich Lowe", "456657897", 2500);
         * 
         * // savacc1.compound();
         * 
         * chkacc1.showInfo(); System.out.println("***********"); savacc1.showInfo();
         * 
         * // savacc1.deposit(5000); // savacc1.withdraw(200); //
         * savacc1.transfer("Brokerage", 3000);
         */

        // Read a CSV file then create ne accts based on that data
        List<String[]> newAccountHolders = Utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("New Account:: ");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN + " " + accountType + " $" +
            // initDeposit);
            if (accountType.equals("Savings")) {
                // System.out.println("Open a Savings account");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                // System.out.println("Open a Checking account");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error reading account type!");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n**********");
            acc.showInfo();
        }
    }
}