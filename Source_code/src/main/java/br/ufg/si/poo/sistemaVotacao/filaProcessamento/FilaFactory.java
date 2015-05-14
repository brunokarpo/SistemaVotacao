package br.ufg.si.poo.sistemaVotacao.filaProcessamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilaFactory {

	private static final Logger LOG = LoggerFactory.getLogger(FilaFactory.class);
	private static FilaFactory filaFactory;

	private IFilaProcessamento fila;

	private FilaFactory() {
		//Singleton

		// Só tem uma implementação. Se começar existir outras, inicializar fila em outro metodo;
		fila = new FilaProcessamentoImpl();
	}

	public static FilaFactory getFilaFactory() {
		if(filaFactory == null) {
			LOG.info("Criando fábrica de fila");
			filaFactory = new FilaFactory();
			LOG.info("Fábrica de fila criada");
		}
		return filaFactory;
	}

	public IFilaProcessamento getFila() {
		return fila;
	}
}
