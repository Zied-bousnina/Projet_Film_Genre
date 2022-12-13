package com.zied.film.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;

@RepositoryRestResource(path = "film")
public interface FilmRepository  extends JpaRepository<Film, Long> {
	
	List<Film> findByNomFilm(String nom);
	List<Film> findByNomFilmContains(String nom);
	
	@Query("select f from Film f where f.nomFilm like %?1 and f.duree > ?2")
	List<Film> findByNomDuree(String nom, Double duree);
	
	@Query("select f from Film f where f.genre = ?1")
	List<Film> findByGenre(Genre genre);
	

	List<Film> findByGenreIdGenre(int id);
	
	
	List<Film> findByOrderByNomFilmAsc();
	
	@Query("select f from Film f order by f.nomFilm ASC, f.duree DESC")
	List<Film> trierFilmNomsDuree();

}

//@CrossOrigin("http://localhost:4200/")