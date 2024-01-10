package dev.pratibha.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/v1/movies")
@CrossOrigin(origins = "*") //cross origin resource sharing
public class MovieController {
    @Autowired
    private movieservice movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getallmovies()
    {
        return new ResponseEntity<List<Movie>> (movieService.allMovies(), HttpStatus.OK);
    }
@GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbid), HttpStatus.OK);
    }
}
