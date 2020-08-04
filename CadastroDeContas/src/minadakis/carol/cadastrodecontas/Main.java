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
		imprimir("Digite o número da agência: ");
		agenciaCadastro.setNumeroAgencia(scanner.nextInt());
		imprimir("Digite o digito da agência: ");
		agenciaCadastro.setDigitoAgencia(scanner.nextInt());
		
		//Cadastrando Conta Corrente e Digito:
		Conta contaCadastro = new Conta();
		imprimir("Digite o número da Conta Corrente: ");
		contaCadastro.setNumeroConta(scanner.nextLong());
		imprimir("Digite o número do dígito: ");
		contaCadastro.setDigitoConta(scanner.nextInt());
		
		//Imprimindo os dados no console:
		imprimir("Os dados cadastrados foram:\n");
		imprimir("Nome completo: " + cliente1.getNomeCliente());
		imprimir("\nCPF: " + cliente1.getCpfCliente());
		imprimir("\nAgencia Bancária: " + agenciaCadastro.getNumeroAgencia()
				+ "-" + agenciaCadastro.getDigitoAgencia());
		imprimir("\nConta Corrente: " + contaCadastro.getNumeroConta()
				+ "-" + contaCadastro.getDigitoConta());
		
		scanner.close();
	}
	
	
		public static void imprimir(String texto) {
			System.out.print(texto);
	}
}
