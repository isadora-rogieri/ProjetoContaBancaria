package classes;

public class PessoaFisica extends Cliente{
	
	protected String cpf;
	
	public PessoaFisica(String nome, String endereco, String telefone,String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.taxaSaque = 0;
		this.rendimento = 0.02;
	}

	
	@Override
	public String toString() {
		return super.toString() + " PessoaFisica - CPF: " + cpf ;
	}

	
	}
