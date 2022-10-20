public class threadsync implements Runnable
{
    int students = 3;
    static int i = 1, j = 2, k = 3;
    public void queue (String name, int selectedstudents)
    {
        if (selectedstudents <= students)
        {
            System.out.println (selectedstudents + " selected from " + name);
            students = students - selectedstudents;
        }
        else
        {
            System.out.println ("No students to select");
        }
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
        if (name.equals ("t1"))
        {
            queue (name, i);
        }
        else if (name.equals ("t2"))
        {
            queue (name, j);
        }
        else
        {
            queue (name, k);
        }
    }
    public static void main (String[]args)
    {
        threadsync s = new threadsync();
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        Thread t3 = new Thread (s);
        t1.setName ("t1");
        t2.setName ("t2");
        t3.setName ("t3");
        t1.start ();
        t2.start ();
        t3.start ();
    }
}