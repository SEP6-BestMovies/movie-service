package com.via.sep6.best.movies.movie;

import io.quarkus.grpc.MutinyService;

@io.quarkus.grpc.common.Generated(value = "by Mutiny Grpc generator", comments = "Source: MovieService.proto")
public interface MovieService extends MutinyService {

    io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request);

    io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request);
}

