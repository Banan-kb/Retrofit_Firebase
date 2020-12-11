package com.example.retrofit_firebase;

import androidx.appcompat.app.AppCompatActivity;

//import android.graphics.Movie;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);


//      GET a specific movie
        Call<Movie> call = apiService.getMovie("M2");
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Log.d("Banan","URL successfully responded "+response.toString());
                Log.d("Banan","Movie Title: "+response.body().getTitle());
                Log.d("Banan","Movie ImageURL: "+response.body().getImageUrl());
                Log.d("Banan","Movie Genre: "+response.body().getMovieGenre());
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.d("Banan","NO Response. Reason: "+t.toString());
            }
        });

            //POST
//        Call<List<Movie>> call1 = apiService.setMovie("M1", new Movie("Mulan", "https://cdn.pixabay.com/photo/2014/01/05/01/19/dragon-238931_1280.jpg", "Action/Adventure"));
//        call1.enqueue(new Callback<List<Movie>>() {
//            @Override
//            public void onResponse(Call<List<Movie>>call, Response<List<Movie>> response) {
//                Log.d("BananPOST","URL successfully responded "+response.toString());
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Movie>> call, Throwable t) {
//                Log.d("BananPOST","NO Response. Reason: "+t.toString());
//            }
//
//
//        });

        //PUT
        Call<List<Movie>> call2=apiService.setMovieWithoutRandomness("M2", new Movie("Lion King", "https://cdn.pixabay.com/photo/2014/12/12/19/43/lion-565818_1280.jpg", "Drama/Adventure/Musical"));

        call2.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                Log.d("BananPUT","URL successfully responded "+response.toString());
            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {
                Log.d("BananPUT","NO Response. Reason: "+t.toString());

            }



        });

        //DELETE
//        Call<List<Movie>> call3=apiService.deleteMovie("M2");
//        call3.enqueue(new Callback<List<Movie>>() {
//            @Override
//            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
//                Log.d("BananDEL","URL successfully responded "+response.toString());
//            }
//
//            @Override
//            public void onFailure(Call<List<Movie>> call, Throwable t) {
//                Log.d("BananDEL","NO Response. Reason: "+t.toString());
//
//            }
//
//
//
//        });

        //PATCH
        Call<List<Movie>> call4=apiService.updateMovie("M3", new Movie("Aladdin","https://cdn.pixabay.com/photo/2015/08/13/04/53/aladdin-886589_1280.jpg","Animation"));
        call4.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                Log.d("BananPATCH","URL successfully responded "+response.toString());
            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {
                Log.d("BananPATCH","NO Response. Reason: "+t.toString());

            }



        });
    }
}