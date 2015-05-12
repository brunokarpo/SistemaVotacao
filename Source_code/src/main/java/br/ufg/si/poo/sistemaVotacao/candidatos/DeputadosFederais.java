package br.ufg.si.poo.sistemaVotacao.candidatos;

/**
 * @author Bruno Nogueira<br>
 *
 * <p> Enumeração que guarda informações sobre o Deputado Federal.
 * <p> O deputado federal contém:<br><br>
 * * <b>Nome:</b> Nome completo do candidato<br>
 * * <b>Numero:</b> Numero de identificacao do candidato. <u>Observacao:</u> Esse numero devera conter 4 digitos,
 *  ou seja, estar entre 1000 e 9999 inclusive<br>
 * * <b>Partido:</b> Sigla do partido político ao qual aquele candidato pertence<br>
 */
public enum DeputadosFederais {

	BRANCO("Branco", 0, ""),
	NULO("Anulado", 9999, ""),
	DELEGADO_VALDIR("Delegado Valdir", 4500, "PSDB"),
	DANIEL_VILELA("Daniel Vilela", 1510, "PMDB"),
	FLAVIA_MORAIS("Flávia Morais", 1212, "PDT"),
	GIUSEPPE_VECCI("Giuseppe Vecci", 4545, "PSDB"),
	MAGDA_MOFATTO("Magda Mofatto", 2222, "PR"),
	RUBENS_OTONI("Rubens Otoni", 1313, "PT"),
	CELIO_SILVERIA("Célio Silveria", 4599, "PSDB"),
	ALEXANDRE_BALDY("Alexandre Baldy", 4555, "PSDB"),
	JOAO_CAMPOS("João Campos", 4565, "PSDB"),
	JOVAIR_ARANTES("Jovair Arantes", 1414, "PTB"),
	MARCOS_ABRAO("Marcos Abrão", 2345, "PPS"),
	HEULER_CRUVINEL("Heuler Cruvinel", 5500, "PSD"),
	ROBERTO_BALESTRA("Roberto Balestra", 1105, "PP"),
	LUCAS_VERGILIO("Lucas Vergilio", 7777, "SD"),
	PEDRO_CHAVES("Pedro Chaves", 1580, "PMDB"),
	FABIO_SOUZA("Fábio Souza", 4578, "PSDB"),
	THIAGO_PEIXOTO("Thiago Peixoto", 5545, "PSD");

	private String nomeCandidato;

	private int numero;
	private String siglaPartido;

	DeputadosFederais(String nomeCandidato, int numero, String siglaPartido) {
		this.nomeCandidato = nomeCandidato;
		this.numero = numero;
		this.siglaPartido = siglaPartido;
	}

	/**
	 * @return the nomeCandidato
	 */
	public String getNomeCandidato() {
		return nomeCandidato;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the siglaPartido
	 */
	public String getSiglaPartido() {
		return siglaPartido;
	}

	public String toString() {
		return getNomeCandidato() + ";" + getNumero() + ";" + getSiglaPartido();
	}

}
