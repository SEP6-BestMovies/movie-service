package com.via.sep6.best.movies.movie;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@io.quarkus.grpc.common.Generated(value = "by Mutiny Grpc generator", comments = "Source: MovieService.proto")
public class MovieServiceBean extends MutinyMovieServiceGrpc.MovieServiceImplBase implements BindableService, MutinyBean {

    private final MovieService delegate;

    MovieServiceBean(@GrpcService MovieService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
        try {
            return delegate.getMovies(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
        try {
            return delegate.getOneMovie(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}

