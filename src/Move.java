import java.util.ArrayList;

public class Move {

    private ArrayList<Line> lineArrayList;

    public Move() {
        lineArrayList = new ArrayList<Line>();
    }  

    public Move (ArrayList<Line> mArr) {
        lineArrayList = mArr;
    }

    /*********************
     * ACCESS AND MUTATE *
     *********************/

    public void addLine(Line l) {
        lineArrayList.add((l));
    }

    public ArrayList<Line> getLines() {
        return lineArrayList;
    }

    public Line getLine(int i) {
        return lineArrayList.get(i);
    }

    public void setLine(int i, Line l) {
        lineArrayList.set(i, l);
    }

    public void removeMove(int i) {
        lineArrayList.remove(i);
    }

    public void removeMove(Line l) {
        lineArrayList.remove(l);
    }
}