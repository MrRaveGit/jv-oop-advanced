package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double getArea();

    @Override
    public abstract void draw();
}
