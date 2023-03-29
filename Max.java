public class Max {
    public int max1(int a,int b){
       int c;
       if(a>b) 
       {
        c=a;
       }
       else
       {
        c=b;
        
       }
       return c;
    }
    public static void main(String args[]){
Max mp=new Max();
       int x= mp.max1(20,30) ;
       System.out.println("Max is  "+x);
    }
}
