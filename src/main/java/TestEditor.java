public class TestEditor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {new Trapezoid("trapezoid"),
                new Triangle("triangle"),
                new Circle("circle"),
                new Parallelogram("parallelogram"),
                new Point("point"),
                new Cuboid("cuboid")};
        drawingTesting(shapes);
        shapeNamesPrintingTesting(shapes);

        TwoDimensionalShape[] shapes2D = new TwoDimensionalShape[] {new Trapezoid("trapezoid"),
                new Triangle("triangle"),
                new Circle("circle"),
                new Parallelogram("parallelogram") };

        areaCalculationTesting(shapes2D);
        rotationTesting(shapes2D);

        ThreeDimensionalShape cuboid = new Cuboid("cuboid");

        cuboid.volumeCalculation();
    }

    private static void rotationTesting(TwoDimensionalShape[] shapes) {
        System.out.println("---------- ----------");
        System.out.println("---ROTATE  SHAPES---");
        System.out.println("---------- ----------");

        for (TwoDimensionalShape shape: shapes) {
            System.out.println(shape.rotateShape());
        }

        System.out.println();
    }

    public static void drawingTesting(Shape[] shapes) {
        System.out.println("---------- ----------");
        System.out.println("----DRAWING SHAPES---");
        System.out.println("---------- ----------");

        for (Shape shape: shapes) {
            System.out.println(shape.drawShape());
        }

        System.out.println();
    }

    public static void shapeNamesPrintingTesting(Shape[] shapes) {
        System.out.println("---------- ----------");
        System.out.println("--PRINT SHAPES NAMES-");
        System.out.println("---------- ----------");

        PrintShapeName printer = new PrintShapeName();

        for (Shape shape: shapes) {
            printer.printShapeName(shape);
        }

        System.out.println();
    }

    public static void areaCalculationTesting(TwoDimensionalShape[] shapes) {
        System.out.println("------------ ------------");
        System.out.println("---CALCULATE AREA -------");
        System.out.println("------------ ------------");

        for (TwoDimensionalShape shape: shapes) {
            shape.areaCalculation();
        }

        System.out.println();
    }
}
