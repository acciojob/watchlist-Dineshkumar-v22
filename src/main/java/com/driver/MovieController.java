package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    MovieService movieService;
@PostMapping( "/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody() Movie movie)
    {
        movieService.addMovie(movie);
        return new ResponseEntity<>("movies added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequesBody() Director director)
    {
        movieService.addDirector(director);
        return new ResponseEntity<>("director was added successfull",HttpStatus.CREATED);
    }
    @PutMapping("/add-movie-director-pair")
            public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie") String movie, @RequestParam("director") String director)
    {
        movieService.addMovieDirectorPair(movie,director);
        return new ResponseEntity<>("movie director paired",HttpStatus.OK);
    }
    @GetMapping("/get-movie-by-name/{name}")
public ResponseEntity<Movie>  getMovieByName(@PathVariable String Name)
    {
        Movie movie =movieService.getMovieByName(Name);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }
    public ResponseEntity<Director>  getDirectorByName(@PathVariable String directorname)
    {
        Director director = movieService.getDirectorByName(directorname);
        return new ResponseEntity<>(director,HttpStatus.OK);
    }


}


