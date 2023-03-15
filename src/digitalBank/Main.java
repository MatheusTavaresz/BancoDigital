package digitalBank;

public class Main {
	public static void main(String[] args) {
		
		Client matheus = new Client();
		matheus.setClientName("Matheus Patrick");
	
		
		Account cc = new CheckingAccount(matheus);
		Account popanca = new SavingAccount(matheus);
		
		cc.cashDeposit(100);
		
		cc.bankTransfer(80, popanca);
		
		cc.printStatement();
		popanca.printStatement();
	}
}
