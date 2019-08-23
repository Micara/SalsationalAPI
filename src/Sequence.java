import java.util.ArrayList;

public class Sequence {

    private ArrayList <Move> movesArrayList;

    public Sequence () {
        movesArrayList = new ArrayList<>();
    }

        /*********************
     * ACCESS AND MUTATE *
     *********************/

    public void addMove(Move l) {
        movesArrayList.add((l));
    }

    public Move getMove(int i) {
        return movesArrayList.get(i);
    }

    public void setMove(int i, Move l) {
        movesArrayList.set(i, l);
    }

    public void removeMove(int i) {
        movesArrayList.remove(i);
    }

    public void removeMove(Move l) {
        movesArrayList.remove(l);
    }
}