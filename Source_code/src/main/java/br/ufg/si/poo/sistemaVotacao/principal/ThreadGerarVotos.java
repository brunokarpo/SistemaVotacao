package br.ufg.si.poo.sistemaVotacao.principal;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.IFilaProcessamento;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.GeradorVotosImpl;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.IGeradorVotos;

class ThreadGerarVotos implements Runnable {

	private static int VOTOS = 250;

	private IFilaProcessamento fila;

	ThreadGerarVotos(IFilaProcessamento fila) {
		this.fila = fila;
	}

	public void run() {

		IGeradorVotos gerador = new GeradorVotosImpl();
		for(int i = 0; i < VOTOS; i++) {
			fila.armazenarVoto( gerador.gerarVoto() );
		}

	}

}
