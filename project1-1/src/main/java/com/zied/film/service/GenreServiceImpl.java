package com.zied.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zied.film.entities.Genre;
import com.zied.film.repos.FilmRepository;
import com.zied.film.repos.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService{

	@Autowired
	GenreRepository genreRepository;
	@Override
	public Genre saveGenre(Genre p) {
		// TODO Auto-generated method stub
		return genreRepository.save(p);
	}

	@Override
	public Genre updateGenre(Genre p) {
		// TODO Auto-generated method stub
		return genreRepository.save(p);
	}

	@Override
	public void deleteGenre(Genre p) {
		// TODO Auto-generated method stub
		genreRepository.delete(p);
		
	}
	
	@Override
	public void deleteGenreById(int p) {
		// TODO Auto-generated method stub
		genreRepository.deleteById(p);
		
	}

	

	

	@Override
	public Genre getGenre(int id) {
		// TODO Auto-generated method stub
		return genreRepository.findById(id).get();
	}

	@Override
	public List<Genre> getAllGenres() {
		// TODO Auto-generated method stub
		return genreRepository.findAll();
	}

	@Override
	public List<Genre> findByNomGenre(String nom) {
		// TODO Auto-generated method stub
		return genreRepository.findByNomGenre(nom);
	}

	@Override
	public List<Genre> findByNomGenreContains(String nom) {
		// TODO Auto-generated method stub
		return genreRepository.findByNomGenreContains(nom);
	}

	@Override
	public List<Genre> findByOrderByNomGenreAsc() {
		// TODO Auto-generated method stub
		return genreRepository.findByOrderByNomGenreAsc();
	}

	

	
	

}
