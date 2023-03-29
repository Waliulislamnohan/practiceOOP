public class Construct {
    int height;
    int weight;
    public Construct(int a,int b){
        height=a;
        weight=b;
    }
    public static void main(String args[]) {
        Construct ob=new Construct(20,30);
        System.out.println("Height n weight is "+ob.height + ob.weight);
    
    }
}
