package digitalBank;

public class CheckingAccount extends Account {
	
	public CheckingAccount(Client client) {
		super(client);
	}
	
	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Corrente ===");
		super.printFullStatement();
	}

	
	
}
