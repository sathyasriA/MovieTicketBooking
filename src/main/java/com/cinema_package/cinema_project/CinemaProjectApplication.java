package com.cinema_package.cinema_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@SpringBootApplication
@RestController
@RequestMapping("/movie")
public class CinemaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaProjectApplication.class, args);
	}


	public record NewMovieRequest(
		String description,
		String director,
		String genre,
		String title,
		LocalDate date,
		String location,
		int totalSeats,
		int availableSeats,
		int price
		){}

	public record QueryRequest(
			String firstName,
			String lastName,
			String email,
			String contactNumber,
			String messsage
	){}

	public record UsersRequest(
			String firstName,
			String lastName,
			String userName,
			String password
	){}

	public record LoginRequest(
			String userName,
			String password
	){}
}