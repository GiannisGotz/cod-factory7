package gr.aueb.cf.ch13mine.bankapp.model;

/**
 * * The JointAccount class represents an account with two holders.
 * */
public class JoinAccount {
    private double balance;
    private String holder1;
    private String holder2;


    /**
     * Constructs a JointAccount with the specified balance and holders
     * @param balance
     * @param holder1
     * @param holder2
     */
    public JoinAccount(double balance, String holder1, String holder2) {
        this.balance = balance;
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    /**
     * Deposits the specified amount to the current balance
     * @param amount to be deposited
     * returns balance after deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * * Withdraws the specified amount from the account if sufficient balance is available.
     * * @param amount the amount to be withdrawn
     * * @return true if the withdrawal is successful, false otherwise */
    public boolean withdraw(double amount) {
        if ( amount > 0 && balance >= amount) {
            balance -= amount; return true;
        }
            return false;
    }

    /** * Returns the current balance.
     * * @return current balance
     * */
    public double getBalance() {
        return balance;
    }

    /** * Returns an array containing the names of the two holders.
     * * @return array of holder names
     * */
    public String[] getHolders() {
        return new String[] { holder1, holder2};
    }
}
