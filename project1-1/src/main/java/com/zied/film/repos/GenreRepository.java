package com.zied.film.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;

@RepositoryRestResource(path = "genre")
@CrossOrigin("http://localhost:4200/")
public interface GenreRepository extends JpaRepository<Genre, Integer> {
	
	List<Genre> findByNomGenre(String nom);
	List<Genre> findByNomGenreContains(String nom);
	
	
	
	List<Genre> findByOrderByNomGenreAsc();

	

}