public class Point extends Shape{
    private String name;
    public Point(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The point is drawn";
    }

}
