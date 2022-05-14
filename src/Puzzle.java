import java.util.LinkedList;
import java.util.Stack;

public class Puzzle {
    private String _solved;
    
    private String _toBeSolved;

    private Node _currentNode;

    private Integer _whitePiecePosition;

    private LinkedList<Node> _openNodes;

    private LinkedList<Node> _closedNodes;

    private Integer _rightConstraint;

    private Integer _leftConstraint;

    private Integer _upperConstraint;

    private Integer _downConstraint;

    Stack<Node> _nodeThree;

    public Puzzle(String toBeSolved, String solved) {
        _solved = solved;
        _toBeSolved = toBeSolved;
        _currentNode = new Node(toBeSolved);
        _openNodes = new LinkedList<Node>();
        _closedNodes = new LinkedList<Node>();
        _nodeThree = new Stack<Node>();
    }

    public Node solve(){
        calculateConstraints();
        _openNodes.push(_currentNode);
        generateChildNode();

        while(!_openNodes.isEmpty() && !_currentNode.getValue().equalsIgnoreCase(_solved)){
            _currentNode = _openNodes.poll();
            calculateConstraints();
            generateChildNode();
        }

        return _currentNode;
    }

    public LinkedList<Node> generateChildNode(){
        Node newNode = null;
        if(_rightConstraint != null){
            StringBuilder builder = new StringBuilder(_currentNode.getValue());
            builder.setCharAt(_whitePiecePosition, _currentNode.getValue().charAt(_rightConstraint));
            builder.setCharAt(_rightConstraint, ' '); 
            
            newNode = new Node(builder.toString(), _currentNode);

            if(!NodeAlreadyVisited(newNode)){
                _openNodes.add(newNode);
            }
        }

        if(_leftConstraint != null){
            StringBuilder builder = new StringBuilder(_currentNode.getValue());
            builder.setCharAt(_whitePiecePosition, _currentNode.getValue().charAt(_leftConstraint));
            builder.setCharAt(_leftConstraint, ' ');
            newNode = new Node(builder.toString(), _currentNode);

            if(!NodeAlreadyVisited(newNode)){
                _openNodes.add(newNode);
            }
        }

        if(_upperConstraint != null){
            StringBuilder builder = new StringBuilder(_currentNode.getValue());
            builder.setCharAt(_whitePiecePosition, _currentNode.getValue().charAt(_upperConstraint));
            builder.setCharAt(_upperConstraint, ' ');
            newNode = new Node(builder.toString(), _currentNode);

            if(!NodeAlreadyVisited(newNode)){
                _openNodes.add(newNode);
            }
        }

        if(_downConstraint != null){
            StringBuilder builder = new StringBuilder(_currentNode.getValue());
            builder.setCharAt(_whitePiecePosition, _currentNode.getValue().charAt(_downConstraint));
            builder.setCharAt(_downConstraint, ' ');
            newNode = new Node(builder.toString(), _currentNode);

            if(!NodeAlreadyVisited(newNode)){
                _openNodes.add(newNode);
            }     
        }
        
        _closedNodes.push(_currentNode);
        return _openNodes;
    }

    public void calculateConstraints(){
        _whitePiecePosition = _currentNode.getValue().indexOf(' ');

        _rightConstraint = _whitePiecePosition + 1 > 8 ? null : _whitePiecePosition + 1;
        _leftConstraint = _whitePiecePosition - 1 < 0 ? null : _whitePiecePosition - 1;
        _upperConstraint = _whitePiecePosition - 3 < 0 ? null : _whitePiecePosition - 3;
        _downConstraint = _whitePiecePosition + 3 > 8 ? null : _whitePiecePosition + 3;
    }

    public Boolean NodeAlreadyVisited(Node value){
        for (Node node : _closedNodes) {
            if(node.getValue().equalsIgnoreCase(value.getValue())){
                return true;
            }
        }
        return false;
    }

    public Stack<Node> reverseThree(Node node){
        if(node.getParentNode() != null){
            _nodeThree.add(node.getParentNode());
            reverseThree(node.getParentNode());
        }

        return _nodeThree;
    }
    
    public Integer getRightConstraint() {
        return _rightConstraint;
    }

    public void setRightConstraint(int rightConstraint) {
        this._rightConstraint = rightConstraint;
    }

    public Integer getLeftConstraint() {
        return _leftConstraint;
    }

    public void setLeftConstraint(int leftConstraint) {
        this._leftConstraint = leftConstraint;
    }
    public Integer getUpperConstraint() {
        return _upperConstraint;
    }

    public void setUpperConstraint(Integer _upperConstraint) {
        this._upperConstraint = _upperConstraint;
    }

    public Integer getDownConstraint() {
        return _downConstraint;
    }

    public void setDownConstraint(Integer _downConstraint) {
        this._downConstraint = _downConstraint;
    }
}
