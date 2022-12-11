package com.via.sep6.bestmovies;

import com.via.sep6.best.movies.movie.MovieServiceGrpc;
import com.via.sep6.best.movies.movie.MovieServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@QuarkusTest
public class MovieServiceTest {
    private ManagedChannel channel;
    private MovieServiceGrpc.MovieServiceBlockingStub movieServiceBlockingStub;

    @BeforeEach
    void setup() {
        channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        movieServiceBlockingStub = MovieServiceGrpc.newBlockingStub(channel);
    }

    void teardown() {
        channel.shutdown();
    }

    @Test
    void testMovieServiceApi() {
       /* MovieServiceOuterClass.GetMoviesRequest request = MovieServiceOuterClass.GetMoviesRequest.newBuilder().build();
        MovieServiceOuterClass.GetMoviesResponse actual = movieServiceBlockingStub.getMovies(request);

        MovieServiceOuterClass.GetMoviesResponse expeced = MovieServiceOuterClass.GetMoviesResponse.newBuilder().build();

        assertEquals(expeced, actual);

        */
    }
}
