package minadakis.carol.cadastrodecontas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		//Cadastrando nome completo e CPF do cliente:
		Cliente cliente1 = new Cliente();
		imprimir("Digite o nome completo do cliente: ");
		cliente1.setNomeCliente(scanner.nextLine());
		
		imprimir("Digite o CPF do cliente: ");
		cliente1.setCpfCliente(scanner.nextLine());
		
		//Cadastrando Agencia e Digito:
		Agencia agenciaCadastro = new Agencia();
		imprimir("Digite o n�mero da ag�ncia: ");
		agenciaCadastro.setNumeroAgencia(scanner.nextInt());
		imprimir("Digite o digito da ag�ncia: ");
		agenciaCadastro.setDigitoAgencia(scanner.nextInt());
		
		//Cadastrando Conta Corrente e Digito:
		Conta contaCadastro = new Conta();
		imprimir("Digite o n�mero da Conta Corrente: ");
		contaCadastro.setNumeroConta(scanner.nextLong());
		imprimir("Digite o n�mero do d�gito: ");
		contaCadastro.setDigitoConta(scanner.nextInt());
		
		//Imprimindo os dados no console:
		imprimir("Os dados cadastrados foram:\n");
		imprimir("Nome completo: " + cliente1.getNomeCliente());
		imprimir("\nCPF: " + cliente1.getCpfCliente());
		imprimir("\nAgencia Banc�ria: " + agenciaCadastro.getNumeroAgencia()
				+ "-" + agenciaCadastro.getDigitoAgencia());
		imprimir("\nConta Corrente: " + contaCadastro.getNumeroConta()
				+ "-" + contaCadastro.getDigitoConta());
		
		scanner.close();
	}
	
	
		public static void imprimir(String texto) {
			System.out.print(texto);
	}
}
