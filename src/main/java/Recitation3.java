import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scan.nextInt();
        System.out.println("Enter y: ");
        int y = scan.nextInt();
        Circle(x,y);
    }
    public static void Circle(int x, int y){
        Circle circle16 = new Circle(new Point(x, y), 16);
        Circle circle40 = new Circle(new Point(14, 12), 40);

        if (circle16.intersects(circle40)) {
            System.out.println("Circles intersect!");
        } else {
            System.out.println("Circles do not intersect!");
        }

    }
}
