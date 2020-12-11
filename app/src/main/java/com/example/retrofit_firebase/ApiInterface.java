package com.example.retrofit_firebase;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("/movies/{new}.json")
    Call<Movie> getMovie(@Path("new") String s1);

    @POST("/movies/{new}.json")
    Call<List<Movie>> setMovie(@Path("new") String s1, @Body Movie movie);


    @PUT("/movies/{new}.json")
    Call<List<Movie>> setMovieWithoutRandomness(@Path("new") String s1, @Body Movie movie);

    @DELETE("/movies/{new}.json")
    Call<List<Movie>> deleteMovie(@Path("new") String s1);

    @PATCH("/movies/{new}.json")
    Call<List<Movie>> updateMovie(@Path("new") String s1, @Body Movie movie );


}
