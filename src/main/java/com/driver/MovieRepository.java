package com.driver;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
    HashMap<String,Movie> addmovie = new HashMap<>();
    HashMap<String,Director> addDirector = new HashMap<>();
    HashMap<String,List<Director> pair = new HashMap<>();

}
