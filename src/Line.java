

public class Line {

    private String name;
    private Element [] elementsArray;

    public Line () {

    }
    
    public Line (Element... args) {
        elementsArray = new Element [args.length];
        for (int i = 0; i < args.length; i++) {
            elementsArray[i] = args[i];
        }
    }

    public Line(String n, Element [] lea) {
        this.name = n;
        elementsArray = lea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element[] getLineElementArray() {
        return elementsArray;
    }

    public void setLineElementArray(Element[] lineElementArray) {
        this.elementsArray = lineElementArray;
    }
}