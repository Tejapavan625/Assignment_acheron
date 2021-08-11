package com.training.details;

import com.training.exception.MovieNotFoundException;
import com.training.model.Movie;

public class Moviedetailsimpl implements Moviedetails {

	@Override
	public Movie[] getByName(String name) throws MovieNotFoundException {
		// TODO Auto-generated method stub
	
		boolean flag=false;
		int i=0;
		Movie[] movie = new Movie[3];
		for (Movie m1 : movie) {
			if (m1.getName().equals(movie)) {
				flag=true;
				movie[i]=m1;
			}
		}
		if (flag == false) {
			throw new MovieNotFoundException("this movie is not relased");
		}
		return movie;
		
	
	}

	@Override
	public Movie getByRating(int rating) throws MovieNotFoundException {
		// TODO Auto-generated method stub
		boolean b= true;
		Movie movie= null;
		for(Movie m: getAll())
		{
			if(movie.getRating()==rating) {
				b=false;
				movie=m;
			}
		}
		if(b==true) {
			throw new MovieNotFoundException("movie not found");
			
		}
		return movie ;
	}

	@Override
	public Movie[] getAll() {
		// TODO Auto-generated method stud
		return movie();
	}

	@Override
	public Movie getByRank(int rank) throws MovieNotFoundException {
		// TODO Auto-generated method stub
		boolean b= true;
		Movie movie= null;
		for(Movie m: getAll())
		{
			if(movie.getRank()==rank) {
				b=false;
				movie=m;
			}
		}
		if(b==true) {
			throw new MovieNotFoundException("movie not found");
			
		}
		return movie ;
		
	}

}
