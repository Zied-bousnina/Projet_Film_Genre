package com.zied.film;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zied.film.entities.Film;
import com.zied.film.entities.Genre;
import com.zied.film.repos.FilmRepository;
import com.zied.film.repos.GenreRepository;

@SpringBootTest
class Project11ApplicationTests {

	@Autowired
	private FilmRepository filmRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	//Genre--------------------------------------------------------------------------------------------------
	@Test
	public void testCreateGenre() {
		Genre genre = new Genre("Genre1");
		genreRepository.save(genre);
	}
	
	@Test
	public void testFindGenre() {
		Genre p = genreRepository.findById(2).get();
		System.out.println(p);
	}
	
	@Test
	public void testListerTousGenre() {
		List<Genre> genre = genreRepository.findAll();
		for (Genre p : genre) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testUpdateGenre() {
		Genre p = genreRepository.findById(2).get();
		p.setNomGenre("genre3");
		genreRepository.save(p);
	}
	
	@Test
	public void testDeleteGenre() {
		genreRepository.deleteById(1);
		
	}
	
	@Test
	public void testFindGenreByNom() {
		List<Genre> genre = genreRepository.findByNomGenre("genre3");

		for (Genre f : genre) {
			System.out.println(f);

		}
	}
	
	@Test
	public void testFindGenreByNomContains() {
		List<Genre> genre = genreRepository.findByNomGenreContains("3");

		for (Genre f : genre) {
			System.out.println(f);

		}
	}
	
	@Test
	public void testfindByOrderByNomGenreAsc() {
		List<Genre> genre =

				genreRepository.findByOrderByNomGenreAsc();
		for (Genre p : genre) {
			System.out.println(p);
		}

	}
    
	//Genre-------------------------------------------------------------------------------------------------
	@Test
	public void testCreateFilm() {
		Film film = new Film("film2", 1.0);
		filmRepository.save(film);
	}

	@Test
	public void testFindFilm() {
		Film p = filmRepository.findById(2L).get();
		System.out.println(p);
	}

	@Test
	public void testListerTousFilms() {
		List<Film> film = filmRepository.findAll();
		for (Film p : film) {
			System.out.println(p);
		}
	}

	@Test
	public void testUpdateFilm() {
		Film p = filmRepository.findById(2L).get();
		p.setDuree(2.0);
		filmRepository.save(p);
	}

	@Test
	public void testDeleteFilm() {
		filmRepository.deleteById(1L);
		
	}

	@Test
	public void testFindFilmByNom() {
		List<Film> film = filmRepository.findByNomFilm("film1");

		for (Film f : film) {
			System.out.println(f);

		}
	}

	@Test
	public void testFindFilmByNomContains() {
		List<Film> film = filmRepository.findByNomFilmContains("1");

		for (Film f : film) {
			System.out.println(f);

		}
	}

	@Test
	public void findByNomDureed() {
		List<Film> film = filmRepository.findByNomDuree("film1", 1.0);

		for (Film f : film) {
			System.out.println(f);

		}
	}

	@Test
	public void testFindByGenre() {
		Genre genre = new Genre();
		genre.setId(1);
		List<Film> film = filmRepository.findByGenre(genre);

		for (Film f : film) {
			System.out.println(f);
		}
	}

	@Test
	public void testfindByOrderByNomFilmAsc() {
		List<Film> prods =

				filmRepository.findByOrderByNomFilmAsc();
		for (Film p : prods) {
			System.out.println(p);
		}

	}

	@Test
	public void testfindBytrierFilmNomsDuree() {
		List<Film> prods = filmRepository.trierFilmNomsDuree();
		for (Film p : prods) {
			System.out.println(p);
		}

	}

}
