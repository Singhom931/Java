package bankpack;
public class bankbalance{
    public static void main(String args[])
    {
        UBI union = new UBI();
        SBI state = new SBI();
        AXIS axis = new AXIS();
        System.out.println("Your Balance in UBI is "+union.getRateOfInterest());
        System.out.println("Your Balance in SBI is "+state.getRateOfInterest());
        System.out.println("Your Balance in AXIS is "+axis.getRateOfInterest());
    }  
}