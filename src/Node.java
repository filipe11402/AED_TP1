public class Node {
    private Node _parentNode;

    private String _value;

    public Node(String value) {
        _value = value;
    }

    public Node(String value, Node parentNode){
        _value = value;
        _parentNode = parentNode;
    }

    public String getValue(){
        return this._value;
    }

    public Node getParentNode(){
        return _parentNode;
    }
}
