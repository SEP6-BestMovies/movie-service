package com.via.sep6.bestmovies.repository;

import com.via.sep6.bestmovies.model.Movie;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class MovieRepository {

    List<Movie> movies = new ArrayList<>();

    public MovieRepository() {
        movies.add(new Movie(1, "First movie", 1990));
        movies.add(new Movie(1, "Second movie", 1990));
        movies.add(new Movie(1, "Third movie", 1990));
        movies.add(new Movie(1, "Forth movie", 1990));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getOneByTitle(String title) {
        for (Movie movie: movies) {
            if(movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return new Movie(0, "Default movie", 0);
    }
}
