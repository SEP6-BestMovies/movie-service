package com.via.sep6.best.movies.movie;

import static com.via.sep6.best.movies.movie.MovieServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@io.quarkus.grpc.common.Generated(value = "by Mutiny Grpc generator", comments = "Source: MovieService.proto")
public final class MutinyMovieServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMovieServiceGrpc() {
    }

    public static MutinyMovieServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMovieServiceStub(channel);
    }

    public static class MutinyMovieServiceStub extends io.grpc.stub.AbstractStub<MutinyMovieServiceStub> implements io.quarkus.grpc.MutinyStub {

        private MovieServiceGrpc.MovieServiceStub delegateStub;

        private MutinyMovieServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MovieServiceGrpc.newStub(channel);
        }

        private MutinyMovieServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MovieServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMovieServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMovieServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMovies);
        }

        public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getOneMovie);
        }
    }

    public static abstract class MovieServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MovieServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.via.sep6.best.movies.movie.MovieServiceGrpc.getGetMoviesMethod(), asyncUnaryCall(new MethodHandlers<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse>(this, METHODID_GET_MOVIES, compression))).addMethod(com.via.sep6.best.movies.movie.MovieServiceGrpc.getGetOneMovieMethod(), asyncUnaryCall(new MethodHandlers<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse>(this, METHODID_GET_ONE_MOVIE, compression))).build();
        }
    }

    private static final int METHODID_GET_MOVIES = 0;

    private static final int METHODID_GET_ONE_MOVIE = 1;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MovieServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MovieServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_MOVIES:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest) request, (io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse>) responseObserver, compression, serviceImpl::getMovies);
                    break;
                case METHODID_GET_ONE_MOVIE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest) request, (io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse>) responseObserver, compression, serviceImpl::getOneMovie);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}

