package classes;



import excecoes.PessoaJuridicaNaoAbrePoupancaException;

public class ContaPoupanca extends Conta  {

	public ContaPoupanca(Cliente cliente) {
		super();
		if (cliente instanceof PessoaJuridica)
			throw new PessoaJuridicaNaoAbrePoupancaException();
		this.cliente = cliente;
		
	}
	@Override
	public void setCliente(Cliente cliente) {
		if (cliente instanceof PessoaJuridica)
			throw new PessoaJuridicaNaoAbrePoupancaException();
		this.cliente = cliente;
		
	}

	public ContaPoupanca() {
		
	}
	@Override
	public String toString() {
		return "Conta Poupança: " + super.toString()  ;
	}

	
	

		
	
}
