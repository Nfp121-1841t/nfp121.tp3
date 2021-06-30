package question3;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Pile2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Pile2Test
{
    /**
     * Default constructor for test class Pile2Test
     */
    public Pile2Test()
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
    public void myTest()
    {
        question3.Pile2<Integer> pile21 = new question3.Pile2<Integer>(10);
        assertEquals(10, pile21.capacite());
        pile21.empiler(10);
        assertEquals(false, pile21.estPleine());
        assertEquals(false, pile21.estVide());
        assertEquals(10, pile21.sommet());
        assertEquals(10, pile21.depiler());
        assertEquals(true, pile21.estVide());
    }
}

