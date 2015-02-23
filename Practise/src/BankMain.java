import java.io.ObjectInputStream.GetField;


public class BankMain {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BankAccount[] accounts = new BankAccount[100];
		BankAccount account = BankAccount.class.newInstance();
		account.setBalance(400);
		account.setAccountNumber(75);
		accounts[75] = account;
		System.out.println("Account Number is "+accounts[75].accountNumber+" balance is "+accounts[75].balance);
		accounts[75].withdraw(25);
		System.out.println("After Withdrawl :: Account Number is "+accounts[75].accountNumber+" balance is "+accounts[75].balance);
	}

}
