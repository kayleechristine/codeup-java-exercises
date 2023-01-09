package movies;
import java.util.Arrays;

import static movies.MoviesArray.findAll;
import static util.Input.getString;

public class MoviesApplication {

    public static void userMenu() {

        String userInput;

//        do {

            System.out.println("\nWhat would you like to do?\n--------------------");
            System.out.println("0 - Exit\n" +
                    "1 - Browse All\n" +
                    "2 - Animated Movies\n" +
                    "3 - Drama Movies\n" +
                    "4 - Horror Movies\n" +
                    "5 - SciFi Movies");
            System.out.print("--------------------\nEnter your choice: ");

            userInput = getString();

            switch (userInput) {
                case "0":
                    System.out.println("\nExiting...\n");
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("\nAll the Movies:\n--------------------");
                    for (Movie movie : findAll()) {
                        System.out.println(movie.getMovieName());
                    }
                    userMenu();
                case "2":
                    System.out.println("\nAnimated Movies:\n--------------------");
                    for (Movie movie : findAll()) {
                        if (movie.getMovieCategory() == "animated") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    userMenu();
                case "3":
                    System.out.println("\nDrama Movies:\n--------------------");
                    for (Movie movie : findAll()) {
                        if (movie.getMovieCategory() == "drama") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    userMenu();
                case "4":
                    System.out.println("\nHorror Movies:\n--------------------");
                    for (Movie movie : findAll()) {
                        if (movie.getMovieCategory() == "horror") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    userMenu();
                case "5":
                    System.out.println("\nSciFi Movies:\n--------------------");
                    for (Movie movie : findAll()) {
                        if (movie.getMovieCategory() == "scifi") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    userMenu();
                default:
                    System.out.println("\nInvalid Input!");
                    userMenu();

        }

//        } while (!userInput.equals("0"));

    }

    public static void main(String[] args) {

        userMenu();

    }

}