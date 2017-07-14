import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */
public class FindPathTest {

    // No such file exists.
    FindPath fp = new FindPath("fjajfiaefljflealfies.fdlaf");
    @Test
    public void Test1() {
        assertEquals("No Such files found.", fp.numberMatches());
    }
}