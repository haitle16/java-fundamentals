package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    Review review;

    @Before
    public void setUp() throws Exception{
        review = new Review(2, "This restaurant needs to improve their custumer service!", "Johnny Shoemaker");
    }

    @Test
    public void reviewConsTest(){
        assertEquals(2, review.revRating);
        assertEquals("This restaurant needs to improve their custumer service!", review.body);
        assertEquals("Johnny Shoemaker", review.author);
    }
}
