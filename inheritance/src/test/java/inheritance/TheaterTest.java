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

}