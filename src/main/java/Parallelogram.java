public class Parallelogram implements TwoDimensionalShape{
    private String name;
    public Parallelogram(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The parallelogram is drawn";
    }

    @Override
    public void areaCalculation() {
        System.out.println("The area calculation of parallelogram is complete");
    }
}
