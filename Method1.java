public class Method1 {
   public static int maxv(int a,int b) {
    int max;
    if(a>b)
    {
         max=a;
    }
    else
    {
         max=b;
    }
    return max;
    
   } 
   public static void main(String args []) {
    Method1 oc=new Method1();
    int a=10;
    int b=20;
    int c=maxv(a,b);
    System.out.print(c);
   }
}
