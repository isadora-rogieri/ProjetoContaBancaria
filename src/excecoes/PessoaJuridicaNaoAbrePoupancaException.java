package excecoes;

import classes.Cliente;
import classes.Conta;

public class PessoaJuridicaNaoAbrePoupancaException extends RuntimeException {
	public PessoaJuridicaNaoAbrePoupancaException(Cliente cliente, Conta conta ) {
		super ("Cliente do tipo " + cliente.getClass().getSimpleName() + " n�o podem abrir conta Poupa�a");
	}
	
}
