package virtuv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    String input2 = "man";
    @Test
    public void isNotPalindrom()
    {
        assertFalse(app.isPalindrom(input2));
    }
}
