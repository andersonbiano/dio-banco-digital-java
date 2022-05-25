
public abstract class Conta implements IConta{
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected Integer agencia;
	protected Integer numero;
	protected Double saldo = 0.0;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
		
	}
	
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
		
	}
	
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public Integer getAgencia() {
		return agencia;
	}


	public Integer getNumero() {
		return numero;
	}



	public Double getSaldo() {
		return saldo;
	}
	
	protected void infosComuns() {
		System.out.printf("Cliente: %s",cliente.getNome());
		System.out.printf("\nAgência: %d",this.agencia);
	    System.out.printf("\nConta: %d",this.numero);
	    System.out.printf("\nSaldo: %.2f",this.saldo,"\n");
	}




	
	

}
