package br.com.cursojavathiago.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="cursojava")
@SessionScoped
public class Aula1MB {
	private String nome;
	private final String CONSTANTE = "ESSA É UMA CONSTANTE"; 
	
	public Aula1MB(){
		nome = "Fernando A. Ribeiro";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}