package com.via.sep6.bestmovies;

import com.via.sep6.best.movies.movie.MovieServiceOuterClass.Movie;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ObjectMapper {
    public static Movie toObjMovie(com.via.sep6.bestmovies.model.Movie movie) {
        Movie schemaMovie = Movie.newBuilder().setId(movie.getId()).setTitle(movie.getTitle()).setReleaseYear(movie.getYear()).build();
        return schemaMovie;
    }
}
