package com.javabrains.movieinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.movieinfo.entity.Movie;
import com.javabrains.movieinfo.service.MovieService;

@RestController
@RequestMapping("/")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> getMovies()
	{
		return movieService.getMovies();
	}
	
	@PostMapping("/movie")
	public Movie saveMovie(@RequestBody Movie movie)
	{
		movieService.saveMovie(movie);
		return movie;
	}

}
