package com.example.retrofit_firebase;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String imageUrl;

    @SerializedName("genre")
    private String movieGenre;


    public Movie(String title, String imageUrl, String movieGenre) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.movieGenre= movieGenre;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}