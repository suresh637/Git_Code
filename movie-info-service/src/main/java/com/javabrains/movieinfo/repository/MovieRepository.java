package com.javabrains.movieinfo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.javabrains.movieinfo.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
