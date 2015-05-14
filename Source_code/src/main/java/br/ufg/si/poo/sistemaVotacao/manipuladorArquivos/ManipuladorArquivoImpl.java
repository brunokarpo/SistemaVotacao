package br.ufg.si.poo.sistemaVotacao.manipuladorArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public class ManipuladorArquivoImpl implements IManipuladorArquivo {

	public void gravarVoto(VotoPojo voto) {
		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(NOME_ARQUIVO));
			String linha = voto.toString();
			buffWrite.append(linha + "\n");
			buffWrite.close();

		} catch (IOException e) {
			System.err.println("Problema ao abrir buffer de escrita");
		}

	}

}
