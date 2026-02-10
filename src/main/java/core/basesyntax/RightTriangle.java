package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int ONE_HALF = 2;
    private double firstLeg;
    private double secondLeg;
    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        return (firstLeg * secondLeg) / ONE_HALF;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle," + " area: " + getArea() + " sq. units,"
                + " first leg: " + firstLeg + "units, second leg: " + secondLeg
                + "units, " + "color:" + getColor());
    }
}
