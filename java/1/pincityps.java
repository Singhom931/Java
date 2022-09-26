import java.util.Scanner; 
class pincityps
{  
public static void main(String args[])  
{  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");   
    int i =sc.nextInt();
    sc.close();
    pincityps pcps= new pincityps();
    switch(i) {
        case 1:
        pcps.City(421301);
          break;
        case 2:
        pcps.City(421301,"adharwadi ps");
          break;
        case 3:
        pcps.City(421301,"adharwadi ps","kalyan");
          break;
        default:
        pcps.City(421301);
      }
} 
void City(int pin){System.out.println(pin);}
void City(int pin,String ps){System.out.println(pin);System.out.println(ps);}
void City(int pin,String ps,String city){System.out.println(pin);System.out.println(ps);System.out.println(city);}
}
