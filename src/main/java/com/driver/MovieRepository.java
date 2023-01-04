package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
    private HashMap<String,Movie> addmovie;
    private HashMap<String,Director> addDirector;
    private  HashMap<String,List<String>> mdpair;

    public MovieRepository() {
        this.addmovie = new HashMap<String,Movie>();
        this.addDirector = new HashMap<String,Director>();
        this.mdpair = new HashMap<String,List<String>>();
    }
   public void savemovie(Movie movie)
   {
       addmovie.put(movie.getMovieName(),movie);
   }
   public void savedirector(Director director)
   {
       addDirector.put(director.getMovieByName(),director);
   }
   public void mdspair(String movie, String director) {
       if (addmovie.containsKey(movie) && addDirector.containsKey(director)) {
           List<String> p = new ArrayList<>();
           if (mdpair.containsKey(director)) {
               p = mdpair.get(director);
           }
           p.add(movie);
           mdpair.put(director, p);
       }
   }

       public Movie findMovie(String movie){
           return addmovie.get(movie);
       }
       public Director getDirector(String director)
       {
           return addDirector.get(director);
       }
     /*  public List<String> moviesByDirector(String director)
       {
           List<String> moviesfromDirector = new ArrayList<>();
           if(mdpair.containsKey(director))
               moviesfromDirector = mdpair.get(director);
               return moviesfromDirector;
       }
       public List<String> allMovies()
       {
           return new ArrayList<>(addmovie.keySet());
       }
       public void deleteByDirector(String director)
       {
           List<String> deletion = new ArrayList<>();
           if(mdpair.containsKey(director))
             deletion =  mdpair.get(director);
           for(String dir:deletion)
           {
               mdpair.containsKey(deletion);
               {
                   addmovie.remove(deletion);
               }
           }
          mdpair.remove(director);
           if(addDirector.containsKey(director))
               addDirector.remove(director);

       }
      /* public void deleteAllDb()
       {
           List<String> dele = new ArrayList<>();
           dele = addmovie

          for(del Del:addmovie)
          {
              if(!del.isEmpty())
              del.remove();
          }
       }*/
   }


