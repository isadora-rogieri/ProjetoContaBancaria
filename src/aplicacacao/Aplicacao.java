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
		
		AppBanco menu = new AppBanco();

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
		System.out.println("saldo " + conta.getSaldo() + "Cliente: " + conta.getCliente());
		try {
		conta.sacar(150);
		System.out.println("saldo " + conta.getSaldo() + "Cliente: " + conta.getCliente());
		}catch(ExcedeuLimitedeSaldoException e) {
			System.err.println(e.getMessage());
		}
		
		Conta conta2 = new ContaCorrente();
		conta.setCliente(clientes[2]);
		conta.depositar(100);
		System.out.println("saldo " + conta.getSaldo() + "Cliente: " + conta.getCliente());
		try {
		conta.sacar(150);
		System.out.println("saldo " + conta.getSaldo());
		}catch(ExcedeuLimitedeSaldoException e) {
			System.err.println(e.getMessage());
		}
		Conta contaPoup = new ContaPoupanca();
		contaPoup.setCliente(clientes[2]);
		contaPoup.depositar(50);
		System.out.println("Saldo " + contaPoup.getSaldo());
		
		
		
		/*conta.setCliente(new PessoaFisica("Jose", "Av imperatriz", "32324545", "454.456.789-01"));
		conta.setSaldo(150);
		conta.depositar(10);
		conta.sacar(25);
		System.out.println( "saldo da conta " + conta.getSaldo() +" " + conta.getCliente());
		Conta conta2 = new ContaCorrente();
		conta2.setCliente(new PessoaJuridica("Jose", "Av imperatriz", "32324545", "454.456.789-01"));
		conta2.setSaldo(150);
		conta2.depositar(10);
		conta2.sacar(25);
		System.out.println( "saldo da conta " + conta2.getSaldo() +" " + conta2.getCliente());
		
		Conta conta3 = new ContaPoupanca();
		conta3.setCliente(new PessoaJuridica("Jose", "Av imperatriz", "32324545", "454.456.789-01"));
		conta3.depositar(100);
		conta3.sacar(25);
		System.out.println( "saldo da conta " + conta3.getSaldo() +" " + conta3.getCliente());*/
		
	}

}
