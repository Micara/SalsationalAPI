import java.util.ArrayList;

public class Move {

    private ArrayList<Line> moves;

    public Move() {

    }

    /*********************
     * ACCESS AND MUTATE *
     *********************/

    public void addMove(Line l) {
        moves.add((l));
    }

    public Line getMove(int i) {
        return moves.get(i);
    }

    public void setMove(int i, Line l) {
        moves.set(i, l);
    }

    public void removeMove(int i) {
        moves.remove(i);
    }

    public void removeMove(Line l) {
        moves.remove(l);
    }
}