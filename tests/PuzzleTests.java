import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class PuzzleTests {
    @Test
    public void calculateConstraints_returnsAllPuzzleConstraints(){
        String notSolved = " 12356789";
        String solved = "98756 321";
        Puzzle puzzle = new Puzzle(notSolved, solved);

        Integer expectedRightConstraint = 1;
        Integer expectedLeftConstraint = null;
        Integer expectedUpperConstraint = null;
        Integer expectedDownConstraint = 3;

        puzzle.calculateConstraints();

        assertEquals(expectedRightConstraint, puzzle.getRightConstraint());
        assertEquals(expectedLeftConstraint, puzzle.getLeftConstraint());
        assertEquals(expectedUpperConstraint, puzzle.getUpperConstraint());
        assertEquals(expectedDownConstraint, puzzle.getDownConstraint());
    }

    @Test
    public void generateRootChildren_returnsAllRootParentChildren(){
        String notSolved = "1 3567489";
        String solved = "98756 321";
        Puzzle puzzle = new Puzzle(notSolved, solved);
        puzzle.calculateConstraints();
        LinkedList<String> expectedChildren = new LinkedList<String>(Arrays.asList(" 13567489", "13 567489", "1635 7489"));
        
        LinkedList<String> actual = puzzle.generateRootChildren();

        assertTrue(expectedChildren.containsAll(actual));
    }
}
