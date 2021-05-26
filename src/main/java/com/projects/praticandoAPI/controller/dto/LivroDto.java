package com.projects.praticandoAPI.controller.dto;
import com.projects.praticandoAPI.modelo.Livro;

import java.util.List;
import java.util.stream.Collectors;

public class LivroDto {

	private int id;
	private String titulo;
	private String autor;
	
	public LivroDto(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.autor = livro.getAutor();
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public static List<LivroDto> converter(List<Livro> livros) {
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}

}
