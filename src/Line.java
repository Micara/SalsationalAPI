

public class Line {

    private String name;
    private Element [] lineElementArray;

    public Line () {

    }
    
    public Line(String n, Element [] lea) {
        this.name = n;
        lineElementArray = lea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element[] getLineElementArray() {
        return lineElementArray;
    }

    public void setLineElementArray(Element[] lineElementArray) {
        this.lineElementArray = lineElementArray;
    }
}