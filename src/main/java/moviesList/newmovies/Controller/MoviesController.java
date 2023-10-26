package moviesList.newmovies.Controller;

import moviesList.newmovies.Models.Movies;

import moviesList.newmovies.Service.MoviesServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoviesController {
    @Autowired
    private MoviesServiceDB moviesServiceDB;
    @GetMapping("/movies")
    public List<Movies> getAllMovies(){
        return moviesServiceDB.getAllMovies();
    }
    @GetMapping("/movies/id")
    public Movies getMovies(@PathVariable int id){
        return moviesServiceDB.getMovies(id);
    }
    @PostMapping("/movies")
    public void addMovies(@RequestBody Movies movie){
        moviesServiceDB.addMovies(movie);
    }
    @RequestMapping(value = "/movie/{id}", method = RequestMethod.PUT)
    public void updateMovies(@PathVariable int id, @RequestBody Movies movie){
        moviesServiceDB.updateMovies(id, movie);
    }
    @RequestMapping(value = "/movies/{id}", method = RequestMethod.DELETE)
    public void deleteMovies(@PathVariable int id){
        moviesServiceDB.deleteMovies(id);
    }
}
