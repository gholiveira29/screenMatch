import br.com.screenmatch.calculation.CalculationTime;
import br.com.screenmatch.calculation.FilterRecommendation;
import br.com.screenmatch.model.Episode;
import br.com.screenmatch.model.Movie;
import br.com.screenmatch.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("Harry Potter", 2001, true, 10, 100, 200);
        Movie movie2 = new Movie("Harry Potter 2", 2002, true, 10, 100, 300);
        Movie movie3 = new Movie("Harry Potter 3", 2003, true, 10, 100, 250);
        CalculationTime calculationTime = new CalculationTime();
        FilterRecommendation filterRecommendation = new FilterRecommendation();


        movie1.setDuration(200);
        movie1.setRating(10);
        movie2.setDuration(300);
        movie2.setRating(10);
        movie3.setDuration(250);
        movie3.setRating(10);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        System.out.println(movies);
    }
}
