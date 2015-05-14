package br.ufg.si.poo.sistemaVotacao.manipuladorArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public class ManipuladorArquivoImpl implements IManipuladorArquivo {

	public void gravarVoto(VotoPojo voto) {
		try {
			BufferedWriter buffWrite = new BufferedWriter( criarFileWriter() );
			String linha = voto.toString();
			buffWrite.append(linha + "\n");
			buffWrite.close();

		} catch (IOException e) {
			System.err.println("Problema ao escrever registro: " + e);
		}

	}

	private FileWriter criarFileWriter() throws IOException {

		File arquivo = new File(NOME_ARQUIVO);
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		FileWriter file = new FileWriter(arquivo);
		return file;

	}

}
