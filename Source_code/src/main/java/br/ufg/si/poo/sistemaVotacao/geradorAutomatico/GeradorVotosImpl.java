package br.ufg.si.poo.sistemaVotacao.geradorAutomatico;

import java.util.Random;

import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosEstaduais;
import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosFederais;
import br.ufg.si.poo.sistemaVotacao.candidatos.Governadores;
import br.ufg.si.poo.sistemaVotacao.candidatos.Presidentes;
import br.ufg.si.poo.sistemaVotacao.candidatos.Senadores;

public class GeradorVotosImpl implements IGeradorVotos{

	private Random random = new Random();

	public VotoPojo gerarVoto() {

		VotoPojo voto = new VotoPojo(gerarDeputadoFederal(), gerarDeputadoEstadual(), gerarSenador(), gerarGovernadores(), gerarPresidentes());

		return voto;
	}

	private DeputadosEstaduais gerarDeputadoEstadual() {

		int i = random.nextInt( DeputadosEstaduais.values().length );
		int cont = 0;

		for(DeputadosEstaduais deputado : DeputadosEstaduais.values()) {
			if(cont == i) {
				return deputado;
			}
			cont++;
		}
		return null;
	}

	private DeputadosFederais gerarDeputadoFederal() {

		int i = random.nextInt( DeputadosFederais.values().length );
		int cont = 0;

		for(DeputadosFederais deputado : DeputadosFederais.values()) {
			if(cont == i) {
				return deputado;
			}
			cont++;
		}
		return null;
	}

	private Senadores gerarSenador() {

		int i = random.nextInt( Senadores.values().length );
		int cont = 0;

		for(Senadores senador : Senadores.values()) {
			if(cont == i) {
				return senador;
			}
			cont++;
		}
		return null;
	}

	private Governadores gerarGovernadores() {
		int i = random.nextInt( Governadores.values().length );
		int cont = 0;

		for(Governadores governador : Governadores.values()) {
			if(cont == i) {
				return governador;
			}
			cont++;
		}
		return null;
	}

	private Presidentes gerarPresidentes() {
		int i = random.nextInt( Presidentes.values().length );
		int cont = 0;

		for(Presidentes presidente : Presidentes.values()) {
			if(cont == i) {
				return presidente;
			}
			cont++;
		}
		return null;
	}
}
