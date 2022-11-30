package com.via.sep6.bestmovies;

import com.via.sep6.best.movies.MovieService;
import com.via.sep6.best.movies.MovieServiceOuterClass.Movie;
import com.via.sep6.best.movies.MovieServiceOuterClass.GetMoviesRequest;
import com.via.sep6.best.movies.MovieServiceOuterClass.GetMoviesResponse;
import com.via.sep6.bestmovies.repository.MovieRepository;
import io.smallrye.mutiny.Uni;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    @Inject
    MovieRepository movieRepository;

    @Inject
    Logger log;

    @Override
    public Uni<GetMoviesResponse> getMovies(GetMoviesRequest request) {
        log.info("Get Movies Api called.");
        List<Movie> movies = movieRepository.getMovies();
        GetMoviesResponse response = GetMoviesResponse.newBuilder().addAllMovies(movies).build();
        return Uni.createFrom().item(response);
    }
}