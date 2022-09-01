public class Cuboid extends ThreeDimensionalShape{
    private String name;
    public Cuboid(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String drawShape() {
        return "The cuboid is drawn";
    }

    @Override
    public void volumeCalculation() {
        System.out.println("The volume calculation of cuboid is complete");
    }


    @Override
    public String rotateShape() {
        return "The cuboid rotated";
    }
}
