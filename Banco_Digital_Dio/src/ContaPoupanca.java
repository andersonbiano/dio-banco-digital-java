
public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		System.out.println("\nExtrato Conta Poupan�a");
	    super.infosComuns();
	
	}

	

}
