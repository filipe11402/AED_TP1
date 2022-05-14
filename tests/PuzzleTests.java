import static org.junit.Assert.assertEquals;
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
        Node notSolved = new Node("1 3567489");
        Node solved = new Node("98756 321");
        Puzzle puzzle = new Puzzle(notSolved.getValue(), solved.getValue());
        puzzle.calculateConstraints();
        LinkedList<Node> expectedChildren = new LinkedList<Node>(Arrays.asList(new Node("13 567489"), new Node(" 13567489"), new Node("1635 7489")));
        
        LinkedList<Node> actual = puzzle.generateChildNode();

        assertTrue(actual.containsAll(expectedChildren));
    }

    @Test
    public void NodeAlreadyDiscovered_returnsTrue(){
        Node fakeNode = new Node(" 13567489");
        Node notSolved = new Node("1 3567489");
        Node solved = new Node("98756 321");
        Puzzle puzzle = new Puzzle(notSolved.getValue(), solved.getValue());
        puzzle.calculateConstraints();
        puzzle.generateChildNode();

        Boolean actual = puzzle.NodeAlreadyVisited(fakeNode);

        assertTrue(actual);
    }
}
