package classes;



public class ContaCorrente extends Conta  {

	public ContaCorrente(Cliente cliente) {
		super();
		this.cliente = cliente;
		
	}
	public ContaCorrente() {
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString() ;
	}

		
	}





