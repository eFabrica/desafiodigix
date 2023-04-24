package br.com.desafio.build;

import java.util.ArrayList;
import java.util.List;

import br.com.desafio.model.Dependente;
import br.com.desafio.model.Familia;

public class CargaFamilia {		
	
	public List<Familia> geraCargaFamilia(){
		
		List<Familia> listFamiliaTotal = new ArrayList<>();
		
		Dependente d1 = new Dependente("Junior", 10);
		Dependente d2 = new Dependente("Miguel", 15);
		Dependente d2a = new Dependente("Aline", 9);
		List<Dependente> ld1 = new ArrayList<>();	
		ld1.add(d1);
		ld1.add(d2);
		ld1.add(d2a);
		Familia f1 = new Familia("Souza", 500, ld1);
		
		Dependente d3 = new Dependente("Caio", 10);
		Dependente d4 = new Dependente("Henrique", 11);
		List<Dependente> ld2 = new ArrayList<>();
		ld1.add(d3);
		ld1.add(d4);
		Familia f2 = new Familia("Lima", 800, ld2);
		
		Dependente d5 = new Dependente("Robison", 10);
		List<Dependente> ld3 = new ArrayList<>();
		ld1.add(d5);
		Familia f3 = new Familia("Moura", 1200, ld3);
		
		Dependente d7 = new Dependente("Hugo", 10);
		Dependente d8 = new Dependente("Miguel", 15);
		List<Dependente> ld4 = new ArrayList<>();
		ld1.add(d7);
		ld1.add(d8);
		Familia f4 = new Familia("Silva", 700, ld4);
		
		Dependente d9 = new Dependente("Junior", 7);
		Dependente d10 = new Dependente("Miguel", 16);
		List<Dependente> ld5 = new ArrayList<>();
		ld1.add(d9);
		ld1.add(d10);
		Familia f5 = new Familia("Miranda", 1400, ld5);
		
		listFamiliaTotal.add(f1);
		listFamiliaTotal.add(f2);
		listFamiliaTotal.add(f3);
		listFamiliaTotal.add(f4);
		listFamiliaTotal.add(f5);
				
		return listFamiliaTotal;
		
	}

}
