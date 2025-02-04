public class Movie {
  String name;
  int yearReleased;
  boolean isIncludeInPlan;
  private double movieRating;
  private int totalRating;
  int movieLength;

  void showMovieDetails() {
    System.out.println("Name: " + name);
    System.out.println("Year Released: " + yearReleased);
    System.out.println("Is Included in Plan: " + isIncludeInPlan);
    System.out.println("Movie Rating: " + movieRating);
    System.out.println("Total Rating: " + totalRating);
    System.out.println("Movie Length: " + movieLength);
  }

  void setMovieRating(double rating) {
    movieRating += rating;
    totalRating++;
  }

  double returnMovieRating() {
    return movieRating / totalRating;
  }

  int getTotalRating() {
    return totalRating;
  }
}