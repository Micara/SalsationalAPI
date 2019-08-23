import java.util.ArrayList;
public abstract class DanceStyle {

    /******************
     * GLOBAL MEMBERS *
     ******************/

    ArrayList <Move> moves;

    public abstract Move getMove (int i);
    public abstract void addMove(Move m);
    public abstract void removeMove(int i);
    public abstract ArrayList<Move> getMoves();

}