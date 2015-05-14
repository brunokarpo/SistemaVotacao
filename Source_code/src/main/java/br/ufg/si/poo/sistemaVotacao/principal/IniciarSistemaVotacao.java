package br.ufg.si.poo.sistemaVotacao.principal;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.FilaFactory;

public class IniciarSistemaVotacao {

	private FilaFactory fila;

	IniciarSistemaVotacao() {
		fila = FilaFactory.getFilaFactory();

		new Thread(new ThreadGerarVotos( fila.getFila() )).start();
		new Thread(new ThreadConsumirVotos( fila.getFila() )).start();

	}

	public static void main(String[] args) {
		new IniciarSistemaVotacao();
	}

}
