package br.ufg.si.poo.sistemaVotacao.principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.IFilaProcessamento;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.GeradorVotosImpl;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.IGeradorVotos;

class ThreadGerarVotos implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(ThreadGerarVotos.class);
	private static int VOTOS = 250;

	private IFilaProcessamento fila;

	ThreadGerarVotos(IFilaProcessamento fila) {
		this.fila = fila;
	}

	public void run() {

		LOG.info("Iniciando gerador de votos");
		IGeradorVotos gerador = new GeradorVotosImpl();
		for(int i = 0; i < VOTOS; i++) {
			fila.armazenarVoto( gerador.gerarVoto() );
		}
		LOG.info("Terminei de criar os votos! Até mais!");

	}

}
