public class Calculator {
    double a;
    int b;
    int c;
    public void calculation(double a,int x)
    {
        double sum;
        double mul;
this.a=a;
b=x;
sum= a+b;
mul=a*b;
System.out.println("Sum is :"+sum);
System.out.println("mul is :"+mul);

    }
    public void calculation(int a,int x)
    {
        int sum;
        int mul;
this.a=a;
b=x;
sum= a+b;
mul=a*b;
System.out.println("Sum is :"+sum);
System.out.println("mul is :"+mul);

    }
    public static void main(String args[])
    {
        Calculator ob1=new Calculator();
        ob1.calculation(10,20);
        Calculator ob2=new Calculator();
        ob2.calculation(11.7,40);
    }

}
