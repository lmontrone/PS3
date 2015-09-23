import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	Account(int specId, double initialBalance, double newAnnualInterestRate){
		id = specId;
		balance = initialBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setId(int specId){
		id = specId;
	}
	public void setBalance(double initialBalance){
		balance = initialBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(double annualInterestRate){
		return annualInterestRate / 12;
	}
	public double withdraw(double amountWithdrawn) throws InsufficientFundsException{
		if(amountWithdrawn > balance){
			double defecit = amountWithdrawn - balance;
			throw new InsufficientFundsException(defecit);
		}
		balance = balance - amountWithdrawn;
		return amountWithdrawn;
	}
	public double deposit(double amountDeposited){
		balance = balance + amountDeposited;
		return amountDeposited;
	}
}
