public class sleepjoin implements Runnable { 
    public void run() 
    { 
        Thread t = Thread.currentThread(); 
        System.out.println("Current thread: "
                           + t.getName()); 
        System.out.println("Is Alive? " + t.isAlive()); 
    } 
    public static void main(String args[]) throws Exception 
    { 
        Thread t = new Thread(new sleepjoin()); 
        t.start(); 
        t.join(1000); 
        System.out.println("\nJoining after 1000"
                           + " milliseconds: \n"); 
        
        System.out.println("Current thread: "
                           + t.getName()); 
        t.sleep(1000);
        System.out.println("Is alive? " + t.isAlive()); 
    } 
}