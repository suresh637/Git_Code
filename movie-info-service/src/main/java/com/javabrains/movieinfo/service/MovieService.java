package com.javabrains.movieinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabrains.movieinfo.entity.Movie;
import com.javabrains.movieinfo.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	

	public List<Movie> getMovies() {
		return movieRepo.findAll();
	}


	public Movie saveMovie(Movie movie) {
		
		return movieRepo.save(movie);
	}

}
