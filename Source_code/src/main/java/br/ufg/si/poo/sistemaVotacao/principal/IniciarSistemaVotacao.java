package br.ufg.si.poo.sistemaVotacao.principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.FilaFactory;

public class IniciarSistemaVotacao {

	private static final Logger LOG = LoggerFactory.getLogger(IniciarSistemaVotacao.class);
	private FilaFactory factory;

	IniciarSistemaVotacao() {
		LOG.info("Pegando fábrica de fila");
		factory = FilaFactory.getFilaFactory();

		LOG.info("Iniciando gerador de votos...");
		new Thread(new ThreadGerarVotos( factory.getFila() )).start();

		LOG.info("Iniciando consumidor de votos...");
		new Thread(new ThreadConsumirVotos( factory.getFila() )).start();

	}

	public static void main(String[] args) {
		LOG.info("Bem vindo ao sistema de votação. Iniciando...");
		new IniciarSistemaVotacao();
	}

}
