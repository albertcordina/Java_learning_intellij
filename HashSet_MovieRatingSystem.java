import java.util.HashSet;
import java.util.Scanner;
class MovieRating {
    String movieTitle;
    double rating;
    public MovieRating(String movieTitle, double rating) { // the constructor to unite the String and double;
        this.movieTitle = movieTitle;
        this.rating = rating;
    }
}
class RatingSystem {
    HashSet<MovieRating> ratingsSet = new HashSet<>();   // it creates the 'HashSet' for the constructor 'MovieRating' above;
    public void addRating(String movieTitle, double rating) {          // the method for adding the new info;
        MovieRating movieRating = new MovieRating(movieTitle, rating); // linking the class above with the variables;
        ratingsSet.add(movieRating);                                   // IMPORTANT: adding action of the inputs from the constructor above to the 'HashSet';
    }
    public void displayRatings() {                                     // the method for displaying the already stored info in the 'HashSet';
        System.out.println("Movie Ratings:");
        for (MovieRating rating : ratingsSet) {                     // iterates all the elements in the 'HashSet';
            System.out.println("Movie: " + rating.movieTitle +
                    ", Rating: " + rating.rating);
        }
    }
}
public class HashSet_MovieRatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // 'Scanner' is used in the main method;
        RatingSystem ratingSystem = new RatingSystem(); // linking to the class above;

        System.out.println("Enter movie ratings (enter 'done' to finish):");
        while (true) {

            System.out.print("Movie Title: ");
            String movieTitle = scanner.nextLine();     // takes from the user the 'movieTitle';

            if (movieTitle.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Rating: ");
            double rating = scanner.nextDouble();       // takes from the user the 'rating';
            scanner.nextLine();

            ratingSystem.addRating(movieTitle, rating); // calls the method 'addRating' in the class above;
        }
        System.out.println("\nMovie Ratings:");
            ratingSystem.displayRatings();              // called the method 'displayRatings' in the class above;
    }
}