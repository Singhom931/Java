package android;
public class Phoneinfo {
    public static void main(String args[]){
    Phones[] list =  new Phones[3];
    list[0] = new Phones("Redmi" ,6, "Red");
    list[1] = new Phones("Oneplus" ,8, "Grey");
    list[2] = new Phones("Nokia" ,4, "Black");
    list[0].info();list[1].info();list[2].info();
    }
}
