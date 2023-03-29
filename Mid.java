public class Mid {
    int a;
    int b;
    int c;
public Mid(int a,int b, int c)
{
    this.a=a;
    this.b=b;
    this.c=c;
}
    public void sum()
    {
        int x=a*b*c;
        System.out.println("Mid mrks : "+x);
    }
    public static void main(String args[])
    {
        
        Mid std1=new Mid(20,30,40);
        Mid std2=new Mid(70,80,90);
        std1.sum();
        
    }
}
