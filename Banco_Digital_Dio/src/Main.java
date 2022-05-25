
public class Main {

	public static void main(String[] args) {
		Cliente anderson = new Cliente();
		anderson.setNome("anderson");
		Conta cc = new ContaCorrente(anderson);
		Conta poupanca = new ContaPoupanca(anderson);
		cc.depositar(100.0);
		
		cc.imprimirExtrato();
		
		poupanca.imprimirExtrato();
		
		cc.transferir(20, poupanca);
		System.out.println(" ");
		
		cc.imprimirExtrato();
		System.out.println(" ");
		poupanca.imprimirExtrato();

	}

}
