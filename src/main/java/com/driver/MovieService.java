package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie)
    {
        movieRepository.savemovie(movie);
    }
    public void addDirector(Director director)
    {
        movieRepository.savedirector(director);
    }
    public void addMovieDirectorPair(String movie,String director)
    {
        movieRepository.mdspair(movie,director);
    }
    public Movie getMovieByName(String Name)
    {
        return movieRepository.findMovie(Name);

    }
    public Director  getDirectorByName(String director)
    {
        return movieRepository.getDirector(director);
    }


}
