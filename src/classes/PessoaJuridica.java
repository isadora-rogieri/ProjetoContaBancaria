package classes;

public class PessoaJuridica extends Cliente{

	protected String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.taxaSaque = 0.005;
		this.rendimento =0.04;
	}
	@Override
	public String toString() {
		return super.toString() + " PessoaJuridica - CNPJ: " + cnpj  ;
	}
//	@Override
//	public double getTaxadeSaque() {
	//	return taxaSaque;
	//}
	
	
	

}
