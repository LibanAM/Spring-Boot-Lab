package com.bnta.demo.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("movies")
public class MovieController {

    @GetMapping
    public List<String> getMovies(){
        return Arrays.asList("The Wolf of Wall Street", "There will be blood", "Dallas Buyers Club", "The Chronicle");
    }

}
