package digitalBank;

public interface AccountIE {
	void cashWithdrawal(double value);
	
	void cashDeposit(double value);
	
	void bankTransfer(double value, Account destinationAccount);
	
	void printStatement();
}
