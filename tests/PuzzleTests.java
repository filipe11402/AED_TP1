import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PuzzleTests {
    @Test
    public void solve_ReturnsSolvedNode(){
        String solved = "2831647 5";
        String notSolved = "1238 4765";

        Puzzle puzzle = new Puzzle(notSolved, solved);

        Node actual = puzzle.solve();

        assertTrue(actual.getValue().equalsIgnoreCase(solved));
    }
}
