package com.zied.film.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private Double duree;
	
	@ManyToOne
	private Genre genre;
	
	 
	
	
	
	
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Film() {
		super();
	}
	public Film(String nomFilm, Double duree) {
		super();
		this.nomFilm = nomFilm;
		this.duree = duree;
		
		
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public Double getDuree() {
		return duree;
	}
	public void setDuree(Double duree) {
		this.duree = duree;
	}
	
	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", duree=" + duree + ", genre=" + genre + "]";
	}
	
	
	
	
	
	
	

}
