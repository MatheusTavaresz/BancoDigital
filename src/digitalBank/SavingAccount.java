package digitalBank;

public class SavingAccount extends Account{

	public SavingAccount(Client client) {
		super(client);
	}
	
	public void printStatement() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Poupanca ===");
		super.printFullStatement();
	}
	
}
