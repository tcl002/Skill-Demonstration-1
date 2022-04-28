import static org.junit.Assert.*;
import org.junit.*;

public class Tester {
    
    CoinCounter c;

    @Before
    public void setUp(){
        c = new CoinCounter(157);
    }

    @Test
    public void test(){
        assertEquals("Checks that the number of quarters is correct",
            6, c.getChange()[0]);
        assertEquals("Checks that the number of dimes is correct",
            15, c.getChange()[0]);
        assertEquals("Checks that the number of nickels is correct",
            31, c.getChange()[0]);
        assertEquals("Checks that the number of pennies is correct",
            157, c.getChange()[0]);
    }

}
