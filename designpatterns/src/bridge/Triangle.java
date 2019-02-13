package bridge;

public class Triangle extends Shape {

    public Triangle(Colour c) {
        super(c);
    }

    @Override
    public void applyColour() {
        System.out.print("Triangle filled with color ");
        colour.applyColour();
    }

}