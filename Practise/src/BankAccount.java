import java.util.logging.Logger;


public class BankAccount {

	public int balance;
	public int accountNumber;
	private static final Logger logger = Logger.getLogger(BankAccount.class.getName());
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber,int balance){
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void deposit(int depositAmt){
		if(depositAmt>=0){
		this.balance = depositAmt + getBalance();
	}
	}

	public void withdraw(int withdrawAmount){
		if(getBalance() < withdrawAmount){
		logger.severe("Insufficient Funds cannot withdraw amount");	
		}else{
			
			setBalance(balance-withdrawAmount);
			logger.info("New Balance for account : "+getAccountNumber()+" is : "+getBalance());
		}
	}
}
