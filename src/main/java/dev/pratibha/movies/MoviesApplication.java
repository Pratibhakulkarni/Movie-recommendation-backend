package dev.pratibha.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MoviesApplication{

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
//@GetMapping("/") //maps the method(apiroot()) to the url path("/"),
	//When a client makes an HTTP GET request to the "/" path,
	//the associated method (apiroot()) is invoked to handle the request.
	//public String apiRoot(){  //method is apiroot, as its api root
//	return "hello, world!";


}
