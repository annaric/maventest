package virtuv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String input1 = "noon";
    App app = new App();
    boolean expected = true;
    @Test
    public void isPalindrom()
    {
        assertEquals( expected, app.isPalindrom(input1));
    }
}
