package br.ufg.si.poo.sistemaVotacao.manipuladorArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public class ManipuladorArquivoImpl implements IManipuladorArquivo {

	private static final Logger LOG = LoggerFactory.getLogger(ManipuladorArquivoImpl.class);

	public void gravarVoto(VotoPojo voto) {
		try {

			LOG.info("Inicializando gravação do voto");
			BufferedWriter buffWrite = new BufferedWriter( criarFileWriter() );
			LOG.info("Criei um buffer de leitura do arquivo");

			LOG.info("Inserindo voto em String para armazenamento");
			String linha = voto.toString();

			LOG.info("Escrevendo novo voto no arquivo");
			buffWrite.append(linha + "\n");

			LOG.info("Fechando buffer de escrita");
			buffWrite.close();

		} catch (IOException e) {
			LOG.error("Problema ao escrever registro: ", e);
		}

	}

	private FileWriter criarFileWriter() throws IOException {

		LOG.info("Validando se existe um arquivo para gravar a informação.");
		File arquivo = new File(NOME_ARQUIVO);
		if(!arquivo.exists()) {
			LOG.warn("Arquivo não existe. Vou criar um novo");
			arquivo.createNewFile();
			LOG.debug("Arquivo criado em " + arquivo.getAbsolutePath());
		}
		FileWriter file = new FileWriter(arquivo);
		return file;

	}

}
