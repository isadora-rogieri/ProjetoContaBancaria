package classes;



import excecoes.ExcedeuLimitedeSaldoException;


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


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

	public void depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;
			
		} 
	}
	public void transferir(Conta contaFavorecido, double valor) {
		this.sacar(valor);
		contaFavorecido.depositar(valor);
		
	}
	
	public void sacar(double valorSaque)
			throws ExcedeuLimitedeSaldoException{
			if (this.saldo < valorSaque) 
				
		 throw new ExcedeuLimitedeSaldoException();
			if(cliente instanceof PessoaJuridica) {
			saldo -= (valorSaque * (0.005));
		}	saldo =  saldo - valorSaque;
	}
			
	
	public void investir(double valorDeposito) {
		if (valorDeposito > 0) {
			if(cliente instanceof PessoaJuridica) {
				
			saldo += (valorDeposito*(0.02));
			}saldo +=valorDeposito;
					
		} 
	}
}

