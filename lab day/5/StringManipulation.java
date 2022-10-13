public class StringManipulation{
    public static void main(String args[]){
        String a = "om"; String b = "om"; String c = a+" "+b;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.concat(b));
        System.out.println(a.replace('m','o'));
        System.out.println(c.split(" ",2));
        System.out.println(a.charAt(0));
        System.out.println(a.compareTo(b));
        System.out.println(c.substring(2));
    }
}