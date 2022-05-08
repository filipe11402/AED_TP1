import java.util.ArrayList;

public class Entrypoint{
    public static void main(String[] args){
        String puzzle = "987 76321";

        /**
         * The white piece can only move around the exact position before and after it
         * and the items that are exactly 2 positions from it 
         */

         /**
          * APPLY Brute Force Algorithm of type Depth-First on which we explore a Node at it maximum
          * Need to have 2 lists of Nodes, one for the string format that was discovered but their children were not discovered yet
          * another list with the items on which the kids were already generated
          */

          /**
           * Constraints: 
           * When we find a string that already was generated we dont count it as
           */

          /**
           * Create class node with constraints and attributes and the whitespace position
           * Add LinkedList of Node inside Puzzle class
           */
        eightPuzzleSolver(puzzle);
    }

    public static String eightPuzzleSolver(String puzzle){
        ArrayList<String> openNodes = new ArrayList<String>();
        ArrayList<String> closedNodes = new ArrayList<String>();
        Integer whitePiecePosition = getEmptySpace(puzzle);


        return new String();
    }

    public static int getEmptySpace(String value){
        return value.indexOf(" ");
    }
}