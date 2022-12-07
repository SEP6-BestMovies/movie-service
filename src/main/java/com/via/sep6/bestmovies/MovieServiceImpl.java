package com.via.sep6.bestmovies;

import com.via.sep6.best.movies.MovieService;
import com.via.sep6.best.movies.MovieServiceOuterClass;
import com.via.sep6.best.movies.MovieServiceOuterClass.Movie;
import com.via.sep6.best.movies.MovieServiceOuterClass.GetMoviesRequest;
import com.via.sep6.best.movies.MovieServiceOuterClass.GetMoviesResponse;
import com.via.sep6.bestmovies.repository.MovieRepository;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.List;

@GrpcService
public class MovieServiceImpl implements MovieService {

    @Inject
    MovieRepository movieRepository;

    @Inject
    Logger log;

    @Override
    public Uni<GetMoviesResponse> getMovies(GetMoviesRequest request) {
        log.info("Get Movies Api called.");
        List<com.via.sep6.bestmovies.model.Movie> movies = movieRepository.findAll();

        GetMoviesResponse.Builder responseBuilder = GetMoviesResponse.newBuilder();

        for(com.via.sep6.bestmovies.model.Movie movie : movies) {
            responseBuilder.addMovies(ObjectMapper.toObjMovie(movie));
        }

        return Uni.createFrom().item(responseBuilder.build());
    }

    @Override
    public Uni<MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(MovieServiceOuterClass.GetOneMovieRequest request) {
        log.info("Get One Movie Api called.");
        com.via.sep6.bestmovies.model.Movie movie = movieRepository.getOneByTitle(request.getTitle());
        Movie schemaMovie = ObjectMapper.toObjMovie(movie);
        MovieServiceOuterClass.GetOneMovieResponse response = MovieServiceOuterClass.GetOneMovieResponse.newBuilder().setMovie(schemaMovie).build();
        return Uni.createFrom().item(response);
    }
}