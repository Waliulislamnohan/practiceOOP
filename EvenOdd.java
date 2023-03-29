import java.util.Scanner;

public class EvenOdd {
    int num;
public void method (){

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

}
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
      EvenOdd ob= new EvenOdd();
      System.out.print("Enter a number: ");
        ob.num = reader.nextInt();
    
      ob.method(); 
        
    }
}
