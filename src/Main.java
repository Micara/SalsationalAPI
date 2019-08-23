public class Main {
    public static void main(String [] args) {
        
        Element a, b, c, d, e, f, g, h, i, j;
        Line handHold, direction, leader, follower, commonAction;
        Move firstMove;


        System.out.println("Salsational UI");
        Salsa salsaStyle = (Salsa) DanceStyleFactory.getInstance("salsa");

        assert(salsaStyle != null);

        a = new Element("Cross Body", "CB");
        b = new Element("Comb", "C");
        c = new Element("Double Turn", "DT");
        d = new Element("Hammerlock", "H");
        e = new Element("Duck", "D");
        f = new Element("Basic Step", "BS");
        g = new Element("Cross Body Lead", "CBL");
        h = new Element("Cross Body Follow", "CBF");
        i = new Element("Normal Hold", "NH");
        j = new Element("Closed Hold", "CH");


        handHold = new Line(a, b);
        handHold.setName("Hand Hold");
        direction = new Line(c, d);
        direction.setName("Direction");
        leader = new Line(e, f);
        leader.setName("Leader");
        follower = new Line(g, h);
        follower.setName("Follower");
        commonAction = new Line(i, j);
        commonAction.setName("Common Action");

        firstMove = new Move();

        firstMove.addLine(handHold);
        firstMove.addLine(direction);
        firstMove.addLine(leader);
        firstMove.addLine(follower);
        firstMove.addLine(commonAction);

        salsaStyle.addMove(firstMove);

        System.out.println(salsaStyle.toString());
    }
}