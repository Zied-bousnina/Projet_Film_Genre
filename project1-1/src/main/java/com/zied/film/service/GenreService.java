package com.zied.film.service;

import java.util.List;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;

public interface GenreService {
	
	Genre saveGenre(Genre p);

	Genre updateGenre(Genre p);

	void deleteGenre(Genre p);
	void deleteGenreById(int p);

	

	Genre getGenre(int id);

	List<Genre> getAllGenres();

	List<Genre> findByNomGenre(String nom);

	List<Genre> findByNomGenreContains(String nom);

	List<Genre> findByOrderByNomGenreAsc();

	

}
