package com.zied.film.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;
import com.zied.film.service.FilmService;
import com.zied.film.service.GenreService;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class GenreRestController {
	
	@Autowired
	GenreService genreService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Genre> getAllGenres() {
		return genreService.getAllGenres();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Genre getFilmById(@PathVariable("id") int id) {
		return genreService.getGenre(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Genre createGenre(@RequestBody Genre genre) {
		return genreService.saveGenre(genre);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Genre updateGenre(@RequestBody Genre genre) {
		return genreService.updateGenre(genre);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteGenre(@PathVariable("id") int id) {
		genreService.deleteGenreById(id);
	}
	
	@RequestMapping(value="/genreByName/{nom}",method = RequestMethod.GET)
	public List<Genre> findByNomProduitContains(@PathVariable("nom") String nom) {
	return genreService.findByNomGenreContains(nom);
	}

	
	


}
