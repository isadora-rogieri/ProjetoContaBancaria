package excecoes;

public class ExcedeuLimitedeSaldoException extends RuntimeException{

	public ExcedeuLimitedeSaldoException() {
		super("Saldo Insuficiente");
		
	}
	
}
