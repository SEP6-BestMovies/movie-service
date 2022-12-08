package com.via.sep6.best.movies.movie;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.grpc.common.Generated(value = "by gRPC proto compiler (version 1.50.2)", comments = "Source: MovieService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

    private MovieServiceGrpc() {
    }

    public static final String SERVICE_NAME = "com.via.sep6.best.movies.movie.MovieService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getGetMoviesMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getMovies", requestType = com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest.class, responseType = com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getGetMoviesMethod() {
        io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getGetMoviesMethod;
        if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
            synchronized (MovieServiceGrpc.class) {
                if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
                    MovieServiceGrpc.getGetMoviesMethod = getGetMoviesMethod = io.grpc.MethodDescriptor.<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovies")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse.getDefaultInstance())).setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getMovies")).build();
                }
            }
        }
        return getGetMoviesMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getGetOneMovieMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getOneMovie", requestType = com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest.class, responseType = com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getGetOneMovieMethod() {
        io.grpc.MethodDescriptor<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getGetOneMovieMethod;
        if ((getGetOneMovieMethod = MovieServiceGrpc.getGetOneMovieMethod) == null) {
            synchronized (MovieServiceGrpc.class) {
                if ((getGetOneMovieMethod = MovieServiceGrpc.getGetOneMovieMethod) == null) {
                    MovieServiceGrpc.getGetOneMovieMethod = getGetOneMovieMethod = io.grpc.MethodDescriptor.<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOneMovie")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse.getDefaultInstance())).setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getOneMovie")).build();
                }
            }
        }
        return getGetOneMovieMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MovieServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {

            @java.lang.Override
            public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MovieServiceStub(channel, callOptions);
            }
        };
        return MovieServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MovieServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {

            @java.lang.Override
            public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MovieServiceBlockingStub(channel, callOptions);
            }
        };
        return MovieServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MovieServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {

            @java.lang.Override
            public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MovieServiceFutureStub(channel, callOptions);
            }
        };
        return MovieServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public static abstract class MovieServiceImplBase implements io.grpc.BindableService {

        /**
         */
        public void getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request, io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
        }

        /**
         */
        public void getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request, io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOneMovieMethod(), responseObserver);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGetMoviesMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse>(this, METHODID_GET_MOVIES))).addMethod(getGetOneMovieMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest, com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse>(this, METHODID_GET_ONE_MOVIE))).build();
        }
    }

    /**
     */
    public static class MovieServiceStub extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {

        private MovieServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MovieServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MovieServiceStub(channel, callOptions);
        }

        /**
         */
        public void getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request, io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request, io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetOneMovieMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     */
    public static class MovieServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {

        private MovieServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MovieServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MovieServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMoviesMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetOneMovieMethod(), getCallOptions(), request);
        }
    }

    /**
     */
    public static class MovieServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {

        private MovieServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MovieServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MovieServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse> getMovies(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse> getOneMovie(com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetOneMovieMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_MOVIES = 0;

    private static final int METHODID_GET_ONE_MOVIE = 1;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MovieServiceImplBase serviceImpl;

        private final int methodId;

        MethodHandlers(MovieServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_MOVIES:
                    serviceImpl.getMovies((com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesRequest) request, (io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetMoviesResponse>) responseObserver);
                    break;
                case METHODID_GET_ONE_MOVIE:
                    serviceImpl.getOneMovie((com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieRequest) request, (io.grpc.stub.StreamObserver<com.via.sep6.best.movies.movie.MovieServiceOuterClass.GetOneMovieResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class MovieServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MovieServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.via.sep6.best.movies.movie.MovieServiceOuterClass.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MovieService");
        }
    }

    private static final class MovieServiceFileDescriptorSupplier extends MovieServiceBaseDescriptorSupplier {

        MovieServiceFileDescriptorSupplier() {
        }
    }

    private static final class MovieServiceMethodDescriptorSupplier extends MovieServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final String methodName;

        MovieServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (MovieServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MovieServiceFileDescriptorSupplier()).addMethod(getGetMoviesMethod()).addMethod(getGetOneMovieMethod()).build();
                }
            }
        }
        return result;
    }
}

