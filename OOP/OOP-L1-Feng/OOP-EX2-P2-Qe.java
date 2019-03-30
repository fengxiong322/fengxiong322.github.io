/**
 *Account
 *-account: long
 *-type: String
 *-balance: double
 *-interestRate: float
 *--------------
 *+Account(acct: long, typ: String, bal: double)
 *+calcInterest(): void
 *+withdraw(amt: double): boolean
 *+deposit(amt: double): void
 *+getBalance(): double
 *+getAccount(): long
 *+getType(): String
 *+setInterestRate(i: float): void
 */

/**
 * @author Feng Xiong
 *
 */
public class Account {
    private long account;
    private String type;
    private double balance;
    private float interestRate;

    /**
     * @param acct Represents the account
     * @param typ Represents the type
     * @param bal Represents the balance
     */
    public Account(long acct, String typ, double bal) {
        account = acct;
        type = typ;
        balance = bal;
        interestRate = 0.0f;
    }

    /**
     * Calculates the Interest of the balance
     */
    public void calcInterest() {
        balance += balance * interestRate;
    }

    /**
     * @param amt amount to withdraw
     * @return The Success of the withdrawl
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else
            return false;
    }

    /**
     * @param amt amount to deposit
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * @return the current balance of the user
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @return the account number
     */
    public long getAccount() {
        return account;
    }

    /**
     * @return the type of account (eg. chequing, saving)
     */
    public String getType() {
        return type;
    }

    /**
     * @param i new interest rate for the account
     */
    public void setInterestRate(float i) {
        interestRate = i;
    }
}
