package br.ufg.si.poo.sistemaVotacao.geradorAutomatico;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosEstaduais;
import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosFederais;
import br.ufg.si.poo.sistemaVotacao.candidatos.Governadores;
import br.ufg.si.poo.sistemaVotacao.candidatos.Presidentes;
import br.ufg.si.poo.sistemaVotacao.candidatos.Senadores;
/**
 * @author Bruno Nogueira<br>
 *
 * <p>Classe responsável por implementar o serviço disponibilizado pela interface {@link IGerarVotos};
 *
 */
public class GeradorVotosImpl implements IGeradorVotos{

	private static final Logger LOG = LoggerFactory.getLogger(GeradorVotosImpl.class);
	private Random random = new Random();

	public VotoPojo gerarVoto() {
		LOG.info("Gerando um novo voto");
		VotoPojo voto = new VotoPojo(gerarDeputadoFederal(), gerarDeputadoEstadual(), gerarSenador(), gerarGovernadores(), gerarPresidentes());
		LOG.debug("Voto gerado: " + voto);

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
