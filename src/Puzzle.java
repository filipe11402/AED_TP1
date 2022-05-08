import java.util.LinkedList;

public class Puzzle {
    private String _solved;
    
    private String _toBeSolved;

    private Integer _whitePiecePosition;

    private LinkedList<String> _openNodes;

    private int _totalMoves;

    private Integer _rightConstraint;

    private Integer _leftConstraint;

    private Integer _upperConstraint;

    private Integer _downConstraint;

    public Puzzle(String toBeSolved, String solved) {
        _solved = solved;
        _toBeSolved = toBeSolved;
        _whitePiecePosition = toBeSolved.indexOf(" ");
        _openNodes = new LinkedList<String>();
    }

    public String solve(){
        return _solved;
    }

    public LinkedList<String> generateRootChildren(){
        if(_rightConstraint != null){
            StringBuilder builder = new StringBuilder(_toBeSolved);
            builder.setCharAt(_whitePiecePosition, _toBeSolved.charAt(_rightConstraint));
            builder.setCharAt(_rightConstraint, ' ');
            _openNodes.add(builder.toString());
        }

        if(_leftConstraint != null){
            StringBuilder builder = new StringBuilder(_toBeSolved);
            builder.setCharAt(_whitePiecePosition, _toBeSolved.charAt(_leftConstraint));
            builder.setCharAt(_leftConstraint, ' ');
            _openNodes.add(builder.toString());
        }

        if(_upperConstraint != null){
            StringBuilder builder = new StringBuilder(_toBeSolved);
            builder.setCharAt(_whitePiecePosition, _toBeSolved.charAt(_upperConstraint));
            builder.setCharAt(_upperConstraint, ' ');
            _openNodes.add(builder.toString());
        }

        if(_downConstraint != null){
            StringBuilder builder = new StringBuilder(_toBeSolved);
            builder.setCharAt(_whitePiecePosition, _toBeSolved.charAt(_downConstraint));
            builder.setCharAt(_downConstraint, ' ');
            _openNodes.add(builder.toString());
        }
        return _openNodes;
    }

    public void calculateConstraints(){
        //TODO: extract logic
        _rightConstraint = _whitePiecePosition + 1 > 8 ? null : _whitePiecePosition + 1;
        _leftConstraint = _whitePiecePosition - 1 < 0 ? null : _whitePiecePosition - 1;
        _upperConstraint = _whitePiecePosition - 3 < 0 ? null : _whitePiecePosition - 3;
        _downConstraint = _whitePiecePosition + 3 > 8 ? null : _whitePiecePosition + 3;
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
