package excecoes;



public class PessoaJuridicaNaoAbrePoupancaException extends RuntimeException {
	public PessoaJuridicaNaoAbrePoupancaException( ) {
		super ("Esse tipo de cliente n�o podem abrir conta Poupa�a");
	}
	
}
