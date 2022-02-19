package aplicacacao;

import java.util.ArrayList;
import java.util.List;

import classes.Cliente;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaInvestimento;
import classes.ContaPoupanca;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import excecoes.ExcedeuLimitedeSaldoException;
import excecoes.PessoaJuridicaNaoAbrePoupancaException;

public class Aplicacao {

	public static void main(String[] args) {

			Cliente[] clientes = {
				new PessoaFisica("Joao", "Rua dois", "32324545", "456.985.741-62"),
				new PessoaFisica("Maria", "Rua jose de souza", "35624855", "126.978.051-66"),
				new PessoaJuridica("Vani", "Rua cinco", "45224545", "478.935.421-22"),
				new PessoaFisica("Eduardo", "Rua buarque ", "993524163", "413.185.711-11"),
				new PessoaJuridica("Lais", "Rua das amoras", "998563325", "369.963.444-11"),
				new PessoaJuridica("Pietro", "Rua dos doguinhos", "996332415", "118.665.121-92") //6
		};


		Conta conta = new ContaCorrente();
		conta.setCliente(clientes[0]);
		conta.depositar(100);
		System.out.println("Saldo " + conta.getSaldo()  + conta.getCliente());
		try {
			conta.sacar(150);
			System.out.println("Saldo " + conta.getSaldo() + "Cliente: " + conta.getCliente());
		}catch(ExcedeuLimitedeSaldoException e) {
			System.err.println(e.getMessage());
		}

		Conta conta2 = new ContaCorrente();
		conta2.setCliente(clientes[2]);
		conta2.depositar(100);
		System.out.println(conta2);
		try {
			conta2.sacar(50);
			System.out.println(conta2);
		}catch(ExcedeuLimitedeSaldoException e) {
			System.err.println(e.getMessage());
		}

		Conta contaPoup = new ContaPoupanca();
		try {
			contaPoup.setCliente(clientes[2]);
			contaPoup.depositar(50);
			System.out.println(contaPoup);
			System.out.println(clientes[2].getClass());
		} catch (PessoaJuridicaNaoAbrePoupancaException e){
			System.err.println(e.getMessage());
		}
		ContaInvestimento contInvest = new ContaInvestimento();
		contInvest.setCliente(clientes[2]);
		contInvest.investir(100);		
		System.out.println(contInvest);
		contInvest.investir(50);	
		System.out.println(contInvest);

		ContaInvestimento contInvest2 = new ContaInvestimento();
		contInvest2.setCliente(clientes[0]);
		contInvest2.investir(100);		
		System.out.println(contInvest2);

		ContaCorrente contCorrente = new ContaCorrente();
		contCorrente.setCliente(clientes[3]);
		contCorrente.depositar(150);
		contCorrente.transferir(conta2, 50);
		System.out.println(contCorrente);
		System.out.println(conta2);
		
		
		
	}
	

}
