

public class DanceStyleFactory {

    public enum Style {
        SALSA
    }

    /**
     * DanceStyle
     *      |
     *      |
     *    Salsa
     */

    public static DanceStyle getInstance(String a) {
        if (a.equalsIgnoreCase("salsa")) {
            return new Salsa();
        } 

        return new DanceStyle();
    }
}