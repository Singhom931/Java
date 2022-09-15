class student
{
    public static void main(String args[])
    {
        student obj = new student();
        obj.student("KMA");
        obj.student("KMA",1.0);
        obj.student("KMA",1.0,10);
        System.out.println(obj.college);
        System.out.println(obj.year);
        System.out.println(obj.rollno);
    }

    String college;
    Double year;
    int rollno;
    void student(){};
    void student(String a){this.college = a;}
    void student(String b,Double c){this.college = b;this.year = c;}
    void student(String d,Double e,int f){this.college = d;this.year = e;this.rollno = f;}
}