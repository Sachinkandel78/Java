import java.util.Scanner;
class rectangle
{
    private int len,bre;
    public void setdata(int len,int bre)
    {
        this.len=len;
        this.bre=bre;
    }
    public int getarea()
    {
        return(len*bre);
    }
}
class demo 
{
    public static void main(String[] args) {
        scanner sc=new scanner (system.in);
        rectangle r=new rectangle();
        system.out.println("enter length=");
        int len=sc.nextint();
        system.out.println("enter breadth=");
        int bre=sc.nextint();
        r.setdata(len,bre);
        a=r.getarea();
        system.out.println("area of rectangle is="+a);
    }
}