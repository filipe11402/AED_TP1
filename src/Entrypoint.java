import java.util.Stack;

public class Entrypoint{
    public static void main(String[] args){
        String stringData = "2831647 5";
        String solvedString = "1238 4765";

        Puzzle puzzle = new Puzzle(stringData, solvedString);
        Node result = puzzle.solve();

        Stack<Node> stuff = puzzle.reverseThree(result);

        for (Node node : stuff) {
            System.out.println(node.getValue());
        }

        System.out.println(stuff.size());
    }
}