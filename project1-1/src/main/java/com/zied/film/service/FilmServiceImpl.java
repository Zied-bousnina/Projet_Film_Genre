package com.zied.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;
import com.zied.film.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmRepository filmRepository;

	
	@Override
	public Film saveFilm(Film p) {
		// TODO Auto-generated method stub
		return filmRepository.save(p);
	}

	@Override
	public Film updateFilm(Film p) {
		// TODO Auto-generated method stub
		return filmRepository.save(p);
	}

	@Override
	public void deleteFilm(Film p) {
		// TODO Auto-generated method stub
		 filmRepository.delete(p);

	}

	@Override
	public void deleteFilmById(Long id) {
		// TODO Auto-generated method stub
		 filmRepository.deleteById(id);

	}

	@Override
	public Film getFilm(Long id) {
		// TODO Auto-generated method stub
		return filmRepository.findById(id).get();

	}

	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return filmRepository.findAll();

	}

	@Override
	public List<Film> findByNomFilm(String nom) {
		// TODO Auto-generated method stub
		return filmRepository.findByNomFilm(nom);
	}

	@Override
	public List<Film> findByNomFilmContains(String nom) {
		// TODO Auto-generated method stub
		return filmRepository.findByNomFilmContains(nom);
	}

	@Override
	public List<Film> findByNomDuree(String nom, Double duree) {
		// TODO Auto-generated method stub
		return filmRepository.findByNomDuree(nom, duree);
	}

	@Override
	public List<Film> findByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return filmRepository.findByGenre(genre);
	}

	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		// TODO Auto-generated method stub
		return filmRepository.findByOrderByNomFilmAsc();
	}

	@Override
	public List<Film> trierProduitsNomsDuree() {
		// TODO Auto-generated method stub
		return filmRepository.trierFilmNomsDuree();
	}

	@Override
	public List<Film> findByGenreIdCat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
