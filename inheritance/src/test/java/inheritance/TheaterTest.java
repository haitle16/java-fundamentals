package inheritance;
import org.junit.Before;
import org.junit.Test;

import javax.swing.table.JTableHeader;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater theater;

    @Before
    public void setUp() {
        theater = new Theater("AMC Southcenter", "");
        theater.addMovie("Doom");
        theater.addMovie("Ironman");
        theater.addReview(new Review(5,"This theater is awesome!", "Jay Jay"));
    }

    @Test
    public void theaterConstructorTest() {
        assertEquals("AMC Southcenter", theater.name);
        assertEquals("Doom Ironman ", theater.movies);
        System.out.println(theater.movies);
    }

    @Test
    public void theaterRemoveMovieTest() {
        theater.removeMovie("Ironman");
        assertEquals("Doom  ", theater.movies);
    }

    @Test
    public void addReviewTest(){
        String[] expected = {"received 5.0 stars| text: This theater is awesome!| author: Jay Jay"};
        assertEquals(Arrays.toString(expected), theater.reviews.toString());
        theater.addReview(new Review(4.0, "This theater cleanliness is exceptional", "Cait Rubin", "Doom"));
        String expectedMovieName = "[received 5.0 stars| text: This theater is awesome!| author: Jay Jay, received 4.0 stars| text: This theater cleanliness is exceptional| author: Cait Rubin| Movie Name: Doom]";
        assertEquals(expectedMovieName, theater.reviews.toString());
    }

    @Test
    public void updateRatingTest(){
        theater.addReview(new Review(4.0, "This theater cleanliness is exceptional", "Cait Rubin", "Doom"));
        System.out.println(theater.reviews);
        assertEquals(4.5, theater.updateRatings(), 0.0001);
    }

}