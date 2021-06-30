package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class UneUtilisationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UneUtilisationTest
{
    /**
     * Default constructor for test class UneUtilisationTest
     */
    public UneUtilisationTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test() throws Exception
    {
        question1.Pile pile1 = new question1.Pile();
        pile1.empiler(1);
        assertEquals(false, pile1.estPleine());
        assertEquals(false, pile1.estVide());
        assertEquals(1, pile1.depiler());
        assertEquals(true, pile1.estVide());
    }
}

