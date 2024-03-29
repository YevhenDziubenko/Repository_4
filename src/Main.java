import figures.Circle;
import figures.Figure;
import figures.Square;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle("RedTriangle");
        Figure square = new Square("BlueSquare");
        Figure circle = new Circle("GreenCircle");

        showFigureName(triangle);
        showFigureName(square);
        showFigureName(circle);

        showFigureType(triangle);
        showFigureType(square);
        showFigureType(circle);

        triangle.showMyType();
        square.showMyType();
        circle.showMyType();

    }


    public static void showFigureName(Figure figure) {
        figure.showMyName();
    }

    public static void showFigureType(Figure figure) {
        System.out.println(figure.getClass());
    }



    }