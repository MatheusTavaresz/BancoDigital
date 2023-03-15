package digitalBank;

public abstract class Account implements AccountIE{
	
	private static final int branch = 777;
	private static int SEQUENCIAL = 1;
	
	
	protected int bankBranch;
	protected int accountNumber;
	protected double accountBalance;
	protected Client client;
	

	public Account(Client client) {
		this.bankBranch = Account.branch;
		this.accountNumber = SEQUENCIAL++;
		this.client = client;
	}
	
	@Override
	public void cashWithdrawal(double value) {
		// TODO Auto-generated method stub
		accountBalance -= value;
	}

	@Override
	public void cashDeposit(double value) {
		// TODO Auto-generated method stub
		accountBalance += value;
	}

	@Override
	public void bankTransfer(double value, Account destinationAccount) {
		// TODO Auto-generated method stub
		this.cashWithdrawal(value);
		destinationAccount.cashDeposit(value);
	}
	
	
	public int getBankBranch() {
		return bankBranch;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	

	protected void printFullStatement() {
		System.out.println(String.format("Titular da Conta: %s", this.client.getClientName()));
		System.out.println(String.format("Agencia %d", this.bankBranch));
		System.out.println(String.format("Numero %s", this.accountNumber));
		System.out.println(String.format("Saldo %s", this.accountBalance));
	}
	
}
