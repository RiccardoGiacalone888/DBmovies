package moviesList.newmovies.Service;

import moviesList.newmovies.Models.Movies;

import java.util.List;

public interface MoviesService {
    public List<Movies> getAllMovies();
    public Movies getMovies(int id);
    public void addMovies (Movies movie);
    public void updateMovies(int id, Movies movie);
    public void deleteMovies(int id);
}
