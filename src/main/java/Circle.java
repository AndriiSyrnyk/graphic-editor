public class Circle extends TwoDimensionalShape {
    private String name;
    public Circle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The circle is drawn";
    }

    @Override
    public void areaCalculation() {
        System.out.println("The area calculation of circle is complete");
    }

    @Override
    public String moveShape() {
        return "The circle moves";
    }
}
