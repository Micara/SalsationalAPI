import java.util.ArrayList;

public class Salsa extends DanceStyle {

    public Salsa() {
        moves = new ArrayList<>();
    }

    @Override
    public Move getMove(int i) {
        return moves.get(i);
    }

    @Override
    public ArrayList<Move> getMoves() {
        return this.moves;
    }

    @Override
    public void addMove(Move m) {
        moves.add(m);
    }

    @Override
    public void removeMove(int i) {
        moves.remove(i);
    }

    @Override
    public String toString() {
        String str = "";
        for (Move m : moves) {
            for (Line l : m.getLines()) {
                System.out.print("Line: " + l.getName() + " ");
                for (Element e : l.getLineElementArray()) {
                    System.out.print(e.getName());
                    System.out.print(" ");
                    System.out.println(e.getSymbol());
                    System.out.println();
                    //System.out.println(e.getName());
                }
            }   
        }
        return "";
    }
}