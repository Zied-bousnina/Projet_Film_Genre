package com.zied.film.service;

import java.util.List;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;

public interface FilmService {

	Film saveFilm(Film p);

	Film updateFilm(Film p);

	void deleteFilm(Film p);

	void deleteFilmById(Long id);

	Film getFilm(Long id);

	List<Film> getAllFilms();

	List<Film> findByNomFilm(String nom);

	List<Film> findByNomFilmContains(String nom);

	List<Film> findByNomDuree(String nom, Double duree);

	List<Film> findByGenre(Genre genre);

	List<Film> findByGenreIdCat(Long id);

	List<Film> findByOrderByNomFilmAsc();

	List<Film> trierProduitsNomsDuree();

}
