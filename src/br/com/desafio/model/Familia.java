package br.com.desafio.model;

import java.util.List;

public class Familia {

	private String nome;
	private int renda;
	private List<Dependente> listaDependente;
	private int pontos;

	public Familia(String nome, int renda, List<Dependente> listaDependente) {
		this.nome = nome;
		this.renda = renda;
		this.listaDependente = listaDependente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRenda() {
		return renda;
	}

	public void setRenda(int renda) {
		this.renda = renda;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public List<Dependente> getListaDependente() {
		return listaDependente;
	}

	public void setListaDependente(List<Dependente> listaDependente) {
		this.listaDependente = listaDependente;
	}

}
