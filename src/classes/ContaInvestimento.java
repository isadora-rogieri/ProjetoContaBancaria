package classes;


public class ContaInvestimento extends Conta {

	public ContaInvestimento(Cliente cliente) {
		super();
		this.cliente = cliente;

	}
	public ContaInvestimento() {
		this.saldo = 0;
	}
	//Investir
	public void investir(double valorInvest) {
		if (valorInvest > 0) {
			saldo +=  (valorInvest*(cliente.getRendimento())+ valorInvest);

		}

	}
	@Override
	public String toString() {
		return "Conta Invetimento: " + super.toString();
	}
}
