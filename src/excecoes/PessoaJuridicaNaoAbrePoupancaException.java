package excecoes;

import classes.Cliente;
import classes.Conta;

public class PessoaJuridicaNaoAbrePoupancaException extends RuntimeException {
	public PessoaJuridicaNaoAbrePoupancaException( ) {
		super ("Esse tipo de cliente não podem abrir conta Poupaça");
	}
	
}
