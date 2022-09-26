package poly;

public class polyinfo {
    public static void main(String args[])
    {
    polygon poly = new polygon();
    polygon tri = new triangle();
    polygon quad = new quadrilateral();
    polygon pent = new pentagon();

    System.out.println(tri()+tri.sides()+sides());
    System.out.println(tri()+tri.edges()+edges());
    System.out.println(tri()+(double)tri.angle()+angle());
    System.out.println(quad()+quad.sides()+sides());
    System.out.println(quad()+quad.edges()+edges());
    System.out.println(quad()+(double)quad.angle()+angle());
    System.out.println(pent()+pent.sides()+sides());
    System.out.println(pent()+pent.edges()+edges());
    System.out.println(pent()+(double)pent.angle()+angle());

    }

static String tri(){return("A triangle has ");}
static String quad(){return("A quadrilateral has ");}
static String pent(){return("A pentagon has ");}
static String sides(){return(" sides.");}
static String edges(){return(" edges.");}
static String angle(){return(" total angle.");}
}