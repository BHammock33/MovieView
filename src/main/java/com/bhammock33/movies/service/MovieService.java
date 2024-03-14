package com.bhammock33.movies.service;

import com.bhammock33.movies.domain.Movie;
import com.bhammock33.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepo;
    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }
    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }
}
