public class Box2 {
 
    int height;
    int width;
    public Box2(int a, int b) {
    System.out.println("\nBox Created.");//constructor use kore object create er shathe shathei icchamoto parameter pass kora jacche..bar bar height width call call na kore 
    height = a;
    width = b;
    }
    public static void main(String[] args) {
    Box2 box1 = new Box2(10, 20);
    System.out.println("The height of box1 = " + box1.height);
    System.out.println("The width of box1 = " + box1.width);
    Box2 box2 = new Box2(15, 25);
    System.out.println("The height of box2 = " + box2.height);
    System.out.println("The width of box2 = " + box2.width);
    }
}