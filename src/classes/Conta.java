package classes;



import excecoes.ExcedeuLimitedeSaldoException;
import excecoes.PessoaJuridicaNaoAbrePoupancaException;


public class Conta {

	protected Cliente cliente;
	protected double saldo;



	public Conta() {
		this.saldo = 0;
	}


	public Cliente getCliente() {
		return this.cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}
	
	


	public void depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;

		} 
	}

	public void sacar(double valorSaque)
			throws ExcedeuLimitedeSaldoException{
		if (this.saldo < valorSaque) 

			throw new ExcedeuLimitedeSaldoException();
		if(cliente instanceof PessoaJuridica) {
			saldo -= (valorSaque * (0.005));
		}	saldo =  saldo - valorSaque;
	}


	@Override
	public String toString() {
		return " Saldo: " + saldo +" Cliente: " + cliente ;
	}


	public void transferir(Conta contaFavorecido, double valor) {
		this.sacar(valor);
		contaFavorecido.depositar(valor);

	}

}

