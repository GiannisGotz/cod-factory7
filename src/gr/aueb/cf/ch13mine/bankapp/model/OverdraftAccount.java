package gr.aueb.cf.ch13mine.bankapp.model;


/** * The OverdraftAccount class provides the functionality
 * * to withdraw amounts greater than the balance, within
 * * a specified overdraft limit.
 * */
public class OverdraftAccount {
    private double balance;
    private double overdraftLimit;

    /** * Constructs an OverdraftAccount with the specified balance and overdraft limit.
     * * @param balance initial balance
     * * @param overdraftLimit maximum overdraft limit
     * */
    public OverdraftAccount(double overdraftLimit, double balance) {
        this.overdraftLimit = overdraftLimit;
        this.balance = balance;
    }

    /** * Returns the current balance.
     * * @return current balance
     * */
    public double getBalance() {
        return balance;
    }

    /** Sets balance .
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** * Returns the overdraft limit.
     * * @return overdraft limit
     * */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /** Sets overdraft limit.
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /** * Deposits the specified amount into the account.
     * * @param amount the amount to be deposited
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /** * Withdraws the specified amount from the account if within the overdraft limit.
     * * @param amount the amount to be withdrawn
     * * @return true if the withdrawal is successful, false otherwise
     * */
    public boolean withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

}
