package moviesList.newmovies.Service;

import moviesList.newmovies.Models.Movies;
import moviesList.newmovies.Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesServiceDB implements MoviesService{
    @Autowired
    private MoviesRepository moviesRepository;


    public List<Movies> getAllMovies(){
        return moviesRepository.findAll();
    }

    public Movies getMovies(int id){
        Optional<Movies> movies= this.moviesRepository.findById(id);
        if (movies.isPresent()){
            return movies.get();
        }else {
            return null;
        }
    }


    public void addMovies(Movies movie){
        moviesRepository.save(movie);

    }

    public void updateMovies(int id, Movies movie){
       moviesRepository.save(movie);
    }
    public void deleteMovies(int id){
        moviesRepository.deleteById(id);
    }
}
