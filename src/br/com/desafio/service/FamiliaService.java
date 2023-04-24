package br.com.desafio.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.desafio.model.Dependente;
import br.com.desafio.model.Familia;

public class FamiliaService {

	private static final int ATE900 = 5;
	private static final int ACIMA900 = 3;

	public List<Familia> analisePontosFamiliaAte900(List<Familia> listaFamilia) {

		listaFamilia.stream().filter(f -> f.getRenda() <= 900).collect(Collectors.toList());
		listaFamilia.forEach(s -> {
			s.setPontos(ATE900 + verificaQtdDependentes(s.getListaDependente()));
		});

		return listaFamilia;
	}

	public List<Familia> analisePontosFamiliaAcima900(List<Familia> listaFamilia) {

		listaFamilia.stream().filter(f -> f.getRenda() <= 901).collect(Collectors.toList());
		listaFamilia.forEach(s -> {
			s.setPontos(ACIMA900 + verificaQtdDependentes(s.getListaDependente()));
		});

		return listaFamilia;
	}

	private static int verificaQtdDependentes(List<Dependente> listaDependente) {
		return listaDependente.size() > 3 ? 3 : 2;
	}

}
