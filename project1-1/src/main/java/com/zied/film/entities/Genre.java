package com.zied.film.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGenre;
	private String nomGenre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genre")
	private List<Film> films;

	public Genre() {
		super();
	}
	public Genre(String nomGenre, int id) {
		super();
		this.nomGenre = nomGenre;
		this.idGenre = id;
	}

	public Genre(String nomGenre) {
		super();
		this.nomGenre = nomGenre;
	}

	public int getId() {
		return idGenre;
	}

	public void setId(int id) {
		idGenre = id;
	}

	public String getNomGenre() {
		return nomGenre;
	}

	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}

	@Override
	public String toString() {
		return "Genre [Id=" + idGenre + ", nomGenre=" + nomGenre + "]";
	}

}
