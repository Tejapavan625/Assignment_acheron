package com.training.details;
import  com.training.exception.MovieNotFoundException;
import com.training.model.Movie;


public interface Moviedetails {
	Movie[] getByName(String name) throws MovieNotFoundException;

	Movie getByRating(int rating) throws MovieNotFoundException;

	Movie[] getAll();

	Movie getByRank(int rank) throws MovieNotFoundException;


}
