

public class Element {

    private String name;
    private String symbol;

    public Element() {

    }

    public Element (String n, String s) {
        this.name = n;
        this.symbol = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}