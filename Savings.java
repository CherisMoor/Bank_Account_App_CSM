public class Savings extends Account {
    // List properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructos to init savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        // System.out.println("Account Number: " + this.accountNumber);
        // System.out.println("New Savings Account ");
        setSafetyDepBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    };

    private void setSafetyDepBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features: " + "\n  Safety Deposit Box ID: " + safetyDepositBoxID
                + "\n  Safety Deposit Box Key: " + safetyDepositBoxKey);
    }

}