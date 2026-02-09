package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle," + " area: " + getArea() + " sq. units,"
                + " height: " + height + "units, width: " + width
                + "units, " + "color:" + getColor());
    }
}
