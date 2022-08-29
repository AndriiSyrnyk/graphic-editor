public class Triangle extends TwoDimensionalShape{
    private String name;
    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The triangle is drawn";
    }

    @Override
    public void areaCalculation() {
        System.out.println("The area calculation of triangle is complete");
    }
}
