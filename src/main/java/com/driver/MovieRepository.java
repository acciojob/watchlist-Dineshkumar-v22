package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
    HashMap<String,Movie> addmovie;
    HashMap<String,Director> addDirector;
    HashMap<String,List<String>> mdpair;

    public MovieRepository() {
        this.addmovie = new HashMap<String,Movie>();
        this.addDirector = new HashMap<String,Director>();
        this.mdpair = new HashMap<String,List<String>>();
    }
   public void savemovie(Movie movie)
   {
       addmovie.put(movie. getMovieName(),movie);
   }
   public void savedirector(Director director)
   {
       addDirector.put(director.getMovieByName(),director);
   }
   public Object mdspair(String movie, String director) {
       if(addmovie.containsKey(movie) && addDirector.containsKey(director))
       {
           List<String> p = new ArrayList<>();
           if(mdpair.containsKey(director))
           {
               p = mdpair.get(director);
           }
           p.add(movie);
           mdpair.put(director,p);
       }

       public Movie findMovie(String movie){
           return addmovie.get(movie);
       }
       public Director getDirector(String director)
       {
           return addDirector.get(director);
       }
       public String
   }

}
