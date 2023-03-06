package com.javabrains.movieinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="movie")
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="movie_desc")
	private String movieDesc;
	
	public Movie() {}
	
	public Movie(int movieId, String movieName,String movieDesc)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieDesc=movieDesc;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	

}
