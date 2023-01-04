package com.driver;

public class Director {
   private String name;
    private int numberOfMovies;
    private double imdbRating;

    public Director()
    {

    }
    public Director(String name, int numberOfMovies,double imdbRating)
    {
        this.name=name;
        this.numberOfMovies=numberOfMovies;
        this.imdbRating=imdbRating;
    }
    public void setMovieByName()
    {
        this.name=name;
    }
    public String getMovieByName()
    {
        return name;
    }
    public void setnumberOfMovies()
    {
        this.numberOfMovies=numberOfMovies;
    }
    public int getnumberOfMovies()
    {
        return numberOfMovies;
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
