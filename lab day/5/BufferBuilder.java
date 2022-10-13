public class BufferBuilder{
    public static void main(String args[]){
        StringBuffer a = new StringBuffer("Hello");
        StringBuilder b = new StringBuilder("H");
        a.insert(5," World?");
        b.append("ello World?");
        System.out.println(a.toString().equals(b.toString()));
        a.delete(5,12).reverse();
        System.out.println(a.toString());
    }
}