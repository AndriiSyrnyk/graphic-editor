public class Trapezoid extends TwoDimensionalShape {
    private String name;
    public Trapezoid(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The trapezoid is drawn";
    }

    @Override
    public void areaCalculation() {
        System.out.println("The area calculation of trapezoid is complete");
    }

    @Override
    public String moveShape() {
        return "The trapezoid moves";
    }
}
