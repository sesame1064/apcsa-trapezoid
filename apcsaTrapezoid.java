import java.util.Scanner;

public class apcsaTrapezoid {

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the top length: ");
    double top = in.nextDouble();
    System.out.print("Enter the bottom length: ");
    double bottom = in.nextDouble();
    System.out.print("Enter the height: ");
    double height = in.nextDouble();

    double area = (top + bottom)/2 * height;

    System.out.print("The area of the trapezoid is ");
    System.out.printf("%.1f.", area);

  }

}
