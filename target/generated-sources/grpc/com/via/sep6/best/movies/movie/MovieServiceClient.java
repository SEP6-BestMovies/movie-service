package com.via.sep6.best.movies.movie;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@io.quarkus.grpc.common.Generated(value = "by Mutiny Grpc generator", comments = "Source: MovieService.proto")
public class MovieServiceClient implements MovieService, MutinyClient<MutinyMovieServiceGrpc.MutinyMovieServiceStub> {

    private final MutinyMovieServiceGrpc.MutinyMovieServiceStub stub;

    public MovieServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMovieServiceGrpc.MutinyMovieServiceStub, MutinyMovieServiceGrpc.MutinyMovieServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMovieServiceGrpc.newMutinyStub(channel));
    }

    private MovieServiceClient(MutinyMovieServiceGrpc.MutinyMovieServiceStub stub) {
        this.stub = stub;
    }

    public MovieServiceClient newInstanceWithStub(MutinyMovieServiceGrpc.MutinyMovieServiceStub stub) {
        return new MovieServiceClient(stub);
    }

    @Override
    public MutinyMovieServiceGrpc.MutinyMovieServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
        return stub.getMovies(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
        return stub.getOneMovie(request);
    }
}

