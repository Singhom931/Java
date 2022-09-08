class Cross{
    public static void main(String[] args) {
        for(int i=3;i>0;i-=2){
            number(i,i);
        }
        number(100,0);
        for(int i=1;i<4;i+=2){
            number(i,i);
        }
    }
    static void number(int a,int b){
        int c;
        c=3-b;
        for(;c>0;c-=2){
            System.out.print(" ");
        }
        System.out.print("*");
        for(;a>0;a--){
            System.out.print(" ");
        }
        /*if(a>1){System.out.println("*");}*/
        System.out.println("*");
    }

}