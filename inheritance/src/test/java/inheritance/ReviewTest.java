package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review review;

    @Before
    public void setUp() throws Exception{
        review = new Review(2.0, "This restaurant needs to improve their customer service!", "Johnny Shoemaker");
    }

    @Test
    public void reviewConsTest(){
        assertEquals(2.0, review.revRating,0.0);
        assertEquals("This restaurant needs to improve their customer service!", review.body);
        assertEquals("Johnny Shoemaker", review.author);
    }

}
