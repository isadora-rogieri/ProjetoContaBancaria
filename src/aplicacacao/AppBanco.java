package aplicacacao;

import java.util.ArrayList;
import java.util.List;

import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaInvestimento;
import classes.ContaPoupanca;

import classes.PessoaJuridica;
import excecoes.PessoaJuridicaNaoAbrePoupancaException;

public class AppBanco {
	protected ArrayList<Conta> contas = new ArrayList<>();
	protected ArrayList<Cliente> clientes = new ArrayList<>();
	
	public AppBanco() {}
	
	/*public void aberturaContaCorrente(Cliente cliente) {
		contas.add(new ContaCorrente(cliente));
	}
	public void aberturaContaPoupanca( Cliente cliente) {
		contas.add(new ContaPoupanca(cliente));
			
	}*/
	public void abrirContas(Conta conta) {
		this.clientes.add(conta.getCliente());
		this.contas.add(conta);
	}

	public Cliente[] getCliente() {
		Cliente[] clientes = new Cliente[this.clientes.size()];
		return this.clientes.toArray(clientes);
	}
public Conta[] getConta() {
		Conta[] contas = new Conta[this.contas.size()];
		return this.contas.toArray(contas);
	}
	
	
	public void aberturaContaInvestimento(Cliente cliente) {
		contas.add(new ContaInvestimento(cliente));
		}

			
	
}
