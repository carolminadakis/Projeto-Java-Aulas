package minadakis.carol.cadastrodecontas;

public class Conta {
	
	private Long numeroConta;
	private Integer digitoConta;

	public Integer getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(Integer digitoConta) {
		this.digitoConta = digitoConta;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Conta() {
	}
}
