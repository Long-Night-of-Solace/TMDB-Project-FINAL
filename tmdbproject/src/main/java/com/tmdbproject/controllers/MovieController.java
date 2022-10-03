package com.tmdbproject.controllers;

import com.tmdbproject.model.Movie;
import com.tmdbproject.service.MovieService;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "/MovieCatalog")
public class MovieController {
    @Autowired
    private MovieService movieService;

        @PostMapping("/addMovie")
        public Movie addMovie(@RequestBody Movie movie) {
            return movieService.saveMovie(movie);
        }

        @PostMapping("/addMovies")
        public List<Movie> addMovies(@RequestBody List<Movie> movies) {
            return movieService.saveMovies(movies);
        }

        @GetMapping("/movies")
        public List<Movie> findAllMovies() {
            return movieService.getMovies();
        }

        @GetMapping("/movie-{id}")
        public Movie findMovieById(@PathVariable Integer id) {
            return movieService.getMovieById(id);
        }

        @GetMapping("/movie/{title}")
        public Movie findMovieByTitle(@PathVariable String title) {
            return movieService.getMovieByTitle(title);
        }

        @PutMapping("/update")
        public Movie updateMovie(@RequestBody Movie movie) {
            return movieService.updateMovie(movie);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteMovie(@PathVariable Integer id) {
            return movieService.deleteMovie(id);
        }

    @GetMapping("/getMovies")
    @ResponseBody
    public void getMovieFromTmdb()
    {
        TmdbMovies tmdbMovies=new TmdbApi("778b2d8ad1c79636bce968762d1d8363").getMovies();
        List<Movie> list=tmdbMovies.getUpcoming("en",1,"US").getResults().stream().map(
                movieFromApi -> {
                    Movie moviem=new Movie();
                    moviem.setTitle(movieFromApi.getTitle());
                    moviem.setRelease_date(movieFromApi.getReleaseDate());
                    moviem.setOriginal_language(movieFromApi.getOriginalLanguage());
                    moviem.setVote_avarage(String.valueOf(movieFromApi.getVoteAverage()));
//                    moviem.setOverview(movieFromApi.getOverview());
                    return moviem;
                }
        ).collect(Collectors.toList());
        movieService.saveMovies(list);
    }


}
