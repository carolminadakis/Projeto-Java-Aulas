package minadakis.carol.cadastrodecontas;

import java.util.Scanner;

public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Cliente () {
	}
}