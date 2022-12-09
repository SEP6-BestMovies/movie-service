package com.via.sep6.bestmovies.repository;

import com.via.sep6.bestmovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie getOneByTitle(String title);
}
