package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figureArrayLength = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figureArrayLength];

        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();

        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = figureSupplier.getDefaultFigure();
        figures[5] = figureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
