package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;


    public Movie()
    {

    }
    public Movie(String name, int durationInMinutes,double imdbRating)
    {
        this.name=name;
        this.durationInMinutes=durationInMinutes;
        this.imdbRating=imdbRating;
    }
    public void setMovieName()
    {
        this.name=name;
    }
    public String getMovieName()
    {
        return name;
    }
    public void setdurationInMinutes()
    {
        this.durationInMinutes=durationInMinutes;
    }

    public int getdurationInMinutes()
    {
        return durationInMinutes;
    }
    public void setimdbRating()
    {
        this.imdbRating=imdbRating;
    }
    public double getimdbRating()
    {
        return imdbRating;
    }

}
