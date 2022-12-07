package com.via.sep6.bestmovies.repository;

import com.via.sep6.best.movies.MovieServiceOuterClass.Movie;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class MovieRepository {

    public List<Movie> getMovies() {
        return new ArrayList<>();
    }

    public Movie getOneMovie(String title) {
        Movie movie = Movie.newBuilder().setId(1).setTitle("Something").setReleaseYear(2022).build();
        return movie;
    }
}
