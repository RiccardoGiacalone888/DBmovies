package moviesList.newmovies.Repository;

import moviesList.newmovies.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer> {
}
