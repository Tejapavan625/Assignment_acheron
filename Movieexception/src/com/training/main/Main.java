package com.training.main;
import java.util.Scanner;
import com.training.exception.MovieNotFoundException;
import com.training.model.Movie;
import com.training.details.*;
import com.training.details.Moviedetailsimpl;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moviedetailsimpl m1 = new Moviedetailsimpl();
		for (Movie moviee : m1.getAll()) {
			System.out.println(moviee);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter rank of movie");
		int rank = sc.nextInt();
		try {
			System.out.println("Enter rank ");
			System.out.println(m1.getByRank(rank));
			System.out.println();
			
			String name = sc.next();
			for (Movie m2 : m1.getByName(name)) {
				if (m2 != null) {
					System.out.println(m2);
				}
				else {
					System.out.println("Wrong input");
				}
			}
			System.out.println();
		} catch (MovieNotFoundException e) {
			System.out.println(e.getMessage());
		}
		sc.close();


	}

}
