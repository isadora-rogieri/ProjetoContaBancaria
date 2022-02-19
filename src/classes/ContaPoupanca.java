package classes;

import java.util.ArrayList;

import excecoes.PessoaJuridicaNaoAbrePoupancaException;

public class ContaPoupanca extends Conta  {

	public ContaPoupanca(Cliente cliente) {
		super();
		if (cliente instanceof PessoaFisica)
			throw new PessoaJuridicaNaoAbrePoupancaException(cliente, this);
		this.cliente = cliente;
		
	}

	public ContaPoupanca() {
		
	}

	
	

		
	
}
