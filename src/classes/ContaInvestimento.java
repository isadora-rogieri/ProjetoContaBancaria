package classes;

import java.util.ArrayList;

public class ContaInvestimento extends Conta {

	public ContaInvestimento(Cliente cliente) {
		super();
		this.cliente = cliente;
		
	}
	public ContaInvestimento() {
		this.saldo = 0;
	}
	/*public void investir(double valorInvest) {
		this.depositar(valorInvest);
		 double redimento = valorInvest * (cliente.getRendimento());
		
	}*/
		
}
