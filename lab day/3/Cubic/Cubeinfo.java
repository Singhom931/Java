package Cubic;

public class Cubeinfo {
    public static void main(String args[])
    {
        Cube cube = new Cube();
        Volume volume = new Volume();
        Surface surface = new Surface();
        PaintCost cost = new PaintCost();
        System.out.println("Side of the Cube "+cube.side());
        System.out.println("Volume of the Cube "+volume.volume());
        System.out.println("Surface Area of the Cube "+surface.surface());
        System.out.println("Cost of the Painting Cube "+cost.cost());
    }
}
