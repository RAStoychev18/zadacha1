package com.example.proektami.lesson1;
import java.lang.reflect.Array;
import java.util.Arrays;

import com.example.proektami.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class MovieRecommenderSystemApplication {
public static void main(String[] args)
{
    RecommenderImplementation recommender = new RecommenderImplementation();
    String[] result=recommender.recommendMovies("Finding Dory");
    System.out.println(Arrays.toString(result));
}
}
