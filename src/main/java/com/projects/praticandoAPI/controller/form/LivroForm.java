package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Livro;

public class LivroForm {

	private String titulo;
	private String autor;

	public LivroForm() {}

	public LivroForm(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Livro converter() {
		return new Livro(titulo, autor);
	}

}
