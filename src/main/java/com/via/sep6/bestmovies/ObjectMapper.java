package com.via.sep6.bestmovies;

import com.via.sep6.best.movies.MovieServiceOuterClass.Movie;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ObjectMapper {
    public Movie toObjMovie(com.via.sep6.bestmovies.model.Movie movie) {
        Movie schemaMovie = Movie.newBuilder().setId(movie.getId()).setTitle(movie.getTitle()).setReleaseYear(movie.getReleaseYear()).build();
        return schemaMovie;
    }
}
